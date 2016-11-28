package lunioussky.qingdan.gui.activity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

/**
 * Created by Administrator on 2016/11/28.
 */

public abstract class BaseActivity extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置为竖屏
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //为Activity设置视图
        setContentView(getContentViewResId());
        //初始化控件
        initViews();
    }
    /**
     * 初始化控件
     * */
    protected abstract void initViews();

    /**
         * 提供Activity要绑定的xml资源id
         * */
    protected abstract int getContentViewResId();
}
