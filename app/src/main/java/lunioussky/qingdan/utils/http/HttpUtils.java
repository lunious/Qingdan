package lunioussky.qingdan.utils.http;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import lunioussky.qingdan.utils.UnicodeParser;

/**
 * Created by Administrator on 2016/12/1.
 */

public class HttpUtils {
    /**线程池**/
    private ExecutorService executors;
    private int maxThreadCount = 5;
    private int connectTimeout = 6000;
    private int readTimeout = 6000;
    private Handler handler = new Handler(Looper.getMainLooper()){
        @Override
        public void handleMessage(Message msg) {
            ResponseCallback responseCallback = (ResponseCallback) msg.obj;
            switch (msg.what){
                case 1:
                    responseCallback.getCallback().onResponse(responseCallback.getResult());
                    break;
                case 2:
                    responseCallback.getCallback().onError();
                    break;
            }
        }
    };
    private HttpUtils(){
        executors = Executors.newFixedThreadPool(maxThreadCount);
    }
    private static HttpUtils instance;

    /**
     * 同步单例模式
     * @return
     */
    public static HttpUtils getInstance(){
        if(instance == null){
            synchronized (HttpUtils.class){
                if(instance == null){
                    instance = new HttpUtils();
                }
            }
        }
        return instance;
    }


    public void execute(Request request,Callback callback){
        HttpRunnable runnable = new HttpRunnable(request, callback);
        executors.execute(runnable);
    }

    public interface Callback{
        void onResponse(String response);
        void onError();
    }

    public static class ResponseCallback {
        private Object tag;
        private Callback Callback;
        private String result;
        public Object getTag() {
            return tag;
        }

        public Callback getCallback() {
            return Callback;
        }

        public String getResult() {
            return result;
        }

        public ResponseCallback(Object tag, Callback callback, String result) {
            this.tag = tag;
            this.Callback = callback;
            this.result = result;
        }
    }

    private class HttpRunnable implements Runnable{
        private Callback callback;
        private Request request;
        public HttpRunnable(Request request,Callback callback) {
            this.callback = callback;
            this.request = request;
        }

        @Override
        public void run() {
            try {
                URL url = new URL(request.getUrl());
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setReadTimeout(readTimeout);
                conn.setConnectTimeout(connectTimeout);
                conn.setRequestMethod(request.getMethod());//设置访问方式
                //添加头部数据
                //为HttpURLConnection添加头部数据
                Headers headers= request.getHeaders();
                if(headers != null){
                    List<String> headerDatas = headers.getNamesAndValues();
                    for (int i = 0; i < headerDatas.size(); i+=2) {
                        conn.addRequestProperty(headerDatas.get(i),headerDatas.get(i+1));
                    }
                }

                if(request.getBody() != null){
                    conn.setDoOutput(true);//允许向服务器写入数据
                    //设置请求主体
                    OutputStream os = conn.getOutputStream();
                    os.write(request.getBody().getBodyBytes());
                }
                InputStream is = conn.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                StringBuffer sb = new StringBuffer();
                String line ;
                while((line = br.readLine()) != null){
                    sb.append(line);
                }
                String result = UnicodeParser.decodeUnicode(sb.toString());
                Log.d("MainFragment2", result);
                if(callback == null) return;

                ResponseCallback responseBallBack = new ResponseCallback(request.getUrl(), callback,result );
                handler.sendMessage(handler.obtainMessage(1,responseBallBack));
                return;
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(callback == null) return;
            ResponseCallback responseBallBack = new ResponseCallback(request.getUrl(), callback,null);
            handler.sendMessage(handler.obtainMessage(2,responseBallBack));
        }
    }
}
