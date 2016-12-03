package lunioussky.qingdan.gui.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.List;

import lunioussky.qingdan.R;
import lunioussky.qingdan.entity.ResponseBatching;

/**
 * Created by Administrator on 2016/12/1.
 */

public class MainSlidePagerAdapter extends PagerAdapter {

    private List<ResponseBatching.DataBean1.SlidesBean1.BodyBean.DataBean.SlidesBean> datas;
    private List<View> views;

    public MainSlidePagerAdapter(Context context,List<ResponseBatching.DataBean1.SlidesBean1.BodyBean.DataBean.SlidesBean> datas) {
        this.datas = datas;
        //根据数据源，初始化views
        views = new ArrayList<>();
        //获取布局加载器
        LayoutInflater inflater = LayoutInflater.from(context);
        for (int i = 0; i < datas.size(); i++) {
            View view = inflater.inflate(R.layout.subview_main_slide_page,null);
            views.add(view);
        }
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = views.get(position% views.size());
        SimpleDraweeView imageView = (SimpleDraweeView) view.findViewById(R.id.imageView_subview_main_slide_page);
        //使用fresco加载网络图片
        imageView.setImageURI(datas.get(position% views.size()).getFeaturedImageUrl());
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        View view = views.get(position% views.size());
        container.removeView(view);
    }
}
