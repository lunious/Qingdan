package lunioussky.qingdan.gui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.List;

import lunioussky.qingdan.R;
import lunioussky.qingdan.entity.ResponseBatching;
import lunioussky.qingdan.gui.adapter.MainSlidePagerAdapter;
import lunioussky.qingdan.mvp.presenter.MainPresenter;
import lunioussky.qingdan.mvp.presenter.MainPresenterImpl;
import lunioussky.qingdan.mvp.view.MainView;

/**
 * Created by Administrator on 2016/11/28.
 */

public class MainFragment extends BaseFragment implements MainView {
    private MainPresenter mainPresenter;
    private MainSlidePagerAdapter mainSlidePagerAdapter;
    private ViewPager mainSlideViewPager;
    //ViewPager的指示器容器
    private LinearLayout mainIndicatorContainer;
    @Override
    protected int getContentViewResId() {
        return R.layout.fragment_main;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mainSlideViewPager = (ViewPager) getView().findViewById(R.id.viewPager_main_list_slide);
        mainPresenter = new MainPresenterImpl(this);
        mainPresenter.loadBatching();

        mainIndicatorContainer = (LinearLayout) getView().findViewById(R.id.linearLayout_pager_indicator);
        mainSlideViewPager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener(){
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                for (int i = 0; i < mainIndicatorContainer.getChildCount(); i++) {
                    ImageView imageView =
                            (ImageView) mainIndicatorContainer.getChildAt(i).findViewById(R.id.imageView_indicator_dot);
                    if (position == i){
                        imageView.setImageResource(R.drawable.home_page_controls_hl);
                    }else{
                        imageView.setImageResource(R.drawable.home_page_controls_nor);
                    }
                }
            }
        });
    }

    @Override
    public void showBatchingData(ResponseBatching batching) {
        Toast.makeText(getActivity(), batching.getMessage(), Toast.LENGTH_SHORT).show();
        List<ResponseBatching.DataBean1.SlidesBean1.BodyBean.DataBean.SlidesBean> slides =
                batching.getData().getSlides().getBody().getData().getSlides();
        mainSlidePagerAdapter = new MainSlidePagerAdapter(getActivity(),slides);
        mainSlideViewPager.setAdapter(mainSlidePagerAdapter);

        //添加指示器（有几个就加载几个）
        LayoutInflater inflater = LayoutInflater.from(getActivity());
        for (int i = 0; i < slides.size(); i++) {
            View view = inflater.inflate(R.layout.subview_indicator_dots,null);
            ImageView imageView = (ImageView) view.findViewById(R.id.imageView_indicator_dot);
            if (i == 0){
                imageView.setImageResource(R.drawable.home_page_controls_hl);
            }else {
                imageView.setImageResource(R.drawable.home_page_controls_nor);
            }
            mainIndicatorContainer.addView(view);
        }

    }

    @Override
    public void showLoadBatchingError() {
        Toast.makeText(getActivity(), "LoadBatchingError", Toast.LENGTH_SHORT).show();
    }
}
