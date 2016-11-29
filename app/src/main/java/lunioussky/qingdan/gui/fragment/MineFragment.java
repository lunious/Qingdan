package lunioussky.qingdan.gui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;

import lunioussky.qingdan.R;
import lunioussky.qingdan.utils.http.Headers;

/**
 * Created by Administrator on 2016/11/28.
 */

public class MineFragment extends BaseFragment {
    @Override
    protected int getContentViewResId() {
        return R.layout.fragment_mine;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Headers headers = new Headers.Builder()
                .addHeader("1","")
                .addHeader("2","")
                .addHeader("3","")
                .build();
    }
}
