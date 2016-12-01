package lunioussky.qingdan;

import android.app.Application;
import android.util.Log;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by Administrator on 2016/12/1.
 * Tips:可以保存一些整个应用全局的数据
 * Application生命周期比较长，正常退出应用的时候Application不会销毁
 */

public class QingdanApplication extends Application {
    public static QingdanApplication instance;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        Fresco.initialize(this);
        Log.d("Application","onCreate");
    }
}
