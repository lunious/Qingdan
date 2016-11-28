package lunioussky.qingdan.gui.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import lunioussky.qingdan.R;
import lunioussky.qingdan.utils.AppVersion;

/**
 * Created by Administrator on 2016/11/28.
 */

public class WelcomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(2500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (isExitByUser){
                    return;
                }
                if (isVersionFirst()){
                    gotoGuide();
                }else{
                    gotoMain();
                }
            }
        }.start();
    }


    /**
     * 进入主界面
     * */
    private void gotoMain() {
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }

    /**
     * 进入引导页
     * */
    private void gotoGuide() {
        startActivity(new Intent(this,GuideActivity.class));
        finish();
    }

    /**
     * 判断当前版本是不是第一次进入应用
     * */
    private boolean isVersionFirst() {
        SharedPreferences sp = getSharedPreferences("app_version",MODE_PRIVATE);
        String version = sp.getString("version", null);

        //获取当前应用版本名字
            String versionName = AppVersion.getAppVersionName(this);

            if (versionName.equals(version)){
                return false;
            }
                sp.edit().putString("version",versionName).commit();
                return true;
            }


    @Override
    protected void initViews() {

    }

    @Override
    protected void initDatas() {

    }

    @Override
    protected int getContentViewResId() {
        return R.layout.activity_welcome;
    }

    /**
     * 在等待过程中用户是否退出了欢迎界面
     * */
    private boolean isExitByUser;
    @Override
    protected void onDestroy() {
        super.onDestroy();

        isExitByUser = true;
    }

    /**
     * 不用强转的findviewbyid
     */
    public <T extends View> T findViewByIdNoCast(int id) {
        return (T) super.findViewById(id);
    }
    /**
     * dip转像素
     */
    public  int dip2px(float dpValue){
        float scale = this.getResources().getDisplayMetrics().density;
        return (int)(dpValue*scale+0.5f);
    }
    /**
     * 像素转dip
     */
    public  int px2dip(float pxValue){
        float scale = this.getResources().getDisplayMetrics().density;
        return (int)(pxValue/scale+0.5f);
    }
    /**
     * 判断是否有网络
     */
    public boolean isNetWork() {
        ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
        return connectivityManager != null
                && connectivityManager.getActiveNetworkInfo() != null
                && connectivityManager.getActiveNetworkInfo().isAvailable();
    }

    /**
     * 获取状态栏高度
     */
    public int getStatusHeight() {
        final Rect rect = new Rect();
        getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int n = rect.top;
        if (n != 0) {
            return n;
        }
        try {
            final Class<?> forName = Class.forName("com.android.internal.R$dimen");
            n = getResources().getDimensionPixelSize(Integer.parseInt(forName.getField("status_bar_height").get(forName.newInstance()).toString()));
        }catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }catch (IllegalAccessException ex2) {
            ex2.printStackTrace();
        }catch (InstantiationException ex3) {
            ex3.printStackTrace();
        }catch (NumberFormatException ex4) {
            ex4.printStackTrace();
        }catch (IllegalArgumentException ex5) {
            ex5.printStackTrace();
        }catch (SecurityException ex6) {
            ex6.printStackTrace();
        }catch (NoSuchFieldException ex7) {
            ex7.printStackTrace();
        }
        return n;
    }

    /**
     * 设置为全屏
     */
    protected void setFullScreen(){
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
