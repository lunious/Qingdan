package lunioussky.qingdan.gui.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import lunioussky.qingdan.R;
import lunioussky.qingdan.utils.AppVersion;

/**
 * Created by Administrator on 2016/11/28.
 */

public class WelcomeActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setFullScreen(); //设置为全屏
        super.onCreate(savedInstanceState);

        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(2500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(isExitByUser){
                    return;
                }
                if(isVersionFirst()){
                    gotoGuide();
                }else{
                    gotoMain();
                }

            }
        }.start();
    }

    /**
     * 进入主界面
     */
    private void gotoMain() {
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }

    /**
     * 进入引导页面
     */
    private void gotoGuide() {
        startActivity(new Intent(this,GuideActivity.class));
        finish();
    }

    /**
     * 判断当前版本是不是第一次进入应用
     *
     * @return
     */
    private boolean isVersionFirst() {
        SharedPreferences sp = getSharedPreferences("app_version",MODE_PRIVATE);
        String version = sp.getString("version", null);

        //获取到当前应用版本名字
        String versionName = AppVersion.getAppVersionName(this);
        if(versionName.equals(version)){
            return false;
        }

        sp.edit().putString("version",versionName).commit();
        return true;

    }

    @Override
    protected void initDatas() {

    }

    @Override
    protected void initViews() {

    }

    @Override
    protected int getContentViewResId() {
        return R.layout.activity_welcome;
    }

    /**在等待过程中用户是否退出了欢迎界面**/
    private boolean isExitByUser;
    @Override
    protected void onDestroy() {
        super.onDestroy();
        isExitByUser = true;
    }
}
