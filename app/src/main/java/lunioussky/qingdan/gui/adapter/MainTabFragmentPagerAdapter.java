package lunioussky.qingdan.gui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import lunioussky.qingdan.entity.ResponseBatching;
import lunioussky.qingdan.gui.fragment.MainListFrament;

/**
 * Created by Administrator on 2016/12/2.
 */

public class MainTabFragmentPagerAdapter extends FragmentPagerAdapter {
    private List<ResponseBatching.DataBean1.ChannelsBean1.BodyBean.DataBean.ChannelsBean> datas;
    private List<Fragment> fragments;
    public MainTabFragmentPagerAdapter(List<ResponseBatching.DataBean1.ChannelsBean1.BodyBean.DataBean.ChannelsBean> datas,
                                       FragmentManager fm) {
        super(fm);
        this.datas = datas;
        fragments = new ArrayList<>();
        for (int i = 0; i < datas.size() + 1; i++) {
            fragments.add(new MainListFrament());
        }
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return "最新";
        }
        return datas.get(position-1).getTitle();
    }
}
