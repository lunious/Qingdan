package lunioussky.qingdan.gui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import lunioussky.qingdan.entity.ResponseBatching;
import lunioussky.qingdan.gui.fragment.MainListFragment;
import lunioussky.qingdan.utils.Contants;

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
        //因为有个"最新标签"不是来自于数据源，所以fragment集合个数要比数据源条数多1个
        fragments.add(MainListFragment.newInstance(Contants.TAG_NODES,"http://api.eqingdan.com/v1/front?page={0}"));
        for (ResponseBatching.DataBean1.ChannelsBean1.BodyBean.DataBean.ChannelsBean data:datas) {
            String urlTag = null;
            if ("collections".equals(data.getType())){
                urlTag = "http://api.eqingdan.com/v1/collections?page={0}";
                fragments.add(MainListFragment.newInstance(Contants.TAG_COLLECTIONS,urlTag));
            }else if ("articles_belong_to_category".equals(data.getType())){
                urlTag = "http://api.eqingdan.com/v1/categories/"+data.getExtra().getCategory_slug()+"/articles?page={0}";
                fragments.add(MainListFragment.newInstance(Contants.TAG_ARTICLES,urlTag));
            }else if ("articles_belong_to_collection".equals(data.getType())){
                urlTag = "http://api.eqingdan.com/v1/collections/"
                        + data.getExtra().getCollection_id()
                        +"/articles?page={0}";
                fragments.add(MainListFragment.newInstance(Contants.TAG_ARTICLES,urlTag));
            }
        }
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
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
