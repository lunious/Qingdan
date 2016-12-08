package lunioussky.qingdan.mvp.model.impl;

import android.util.Log;

import com.alibaba.fastjson.JSON;

import lunioussky.qingdan.entity.ResponseNodes;
import lunioussky.qingdan.mvp.model.NodesModel;
import lunioussky.qingdan.utils.UnicodeParser;
import lunioussky.qingdan.utils.http.HttpUtils;
import lunioussky.qingdan.utils.http.Request;
import lunioussky.qingdan.utils.http.qingdan.HttpClient;

/**
 * Created by 11645 on 2016/12/9.
 */

public class NodesModelImpl implements NodesModel {

    private int nextPage = 1;
    @Override
    public void loadNextPageNodesData(final NodesCallBack callBack) {
        String url = "http://api.eqingdan.com/v1/front?page="+nextPage;
        Request.Builder  builder = new Request.Builder()
                .url(url)
                .get()
                .addHeader("qd-manufacturer", "Xiaomi")
                .addHeader("qd-model", "MI 5")
                .addHeader("qd-os", "Android")
                .addHeader("qd-os-version", "6.0")
                .addHeader("qd-screen-width", "1080")
                .addHeader("qd-screen-height", "1920")
                .addHeader("qd-carrier", "%E4%B8%AD%E5%9B%BD%E8%81%94%E9%80%9A")
                .addHeader("qd-network-type", "WIFI")
                .addHeader("qd-app-id", "com.eqingdan")
                .addHeader("qd-app-version", "2.6")
                .addHeader("qd-app-channel", "mi")
                .addHeader("qd-track-device-id", "eb51c9b1f01ac05c32170fc4cf18d0e7")
                .addHeader("User-Agent", "EQingDan/2.5 (Android; okhttp/2.4.0)");
        HttpClient.excute(builder, new HttpUtils.Callback() {
            @Override
            public void onResponse(String response) {
                Log.d("NodesModelImpl", response);
                response = UnicodeParser.decodeUnicode(response);
                ResponseNodes responseNodes = JSON.parseObject(response, ResponseNodes.class);
                if (responseNodes.getCode() == 0){//代表请求数据成功
                    callBack.loadNodesSuccess(responseNodes.getData().getNodes());
                    nextPage++;
                }
            }

            @Override
            public void onError() {
                    callBack.loadNodesFailed();
            }
        });
    }
}
