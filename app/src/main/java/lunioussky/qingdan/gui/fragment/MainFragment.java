package lunioussky.qingdan.gui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.List;

import lunioussky.qingdan.R;
import lunioussky.qingdan.entity.ResponseBatching;
import lunioussky.qingdan.gui.adapter.MainSlidePagerAdapter;
import lunioussky.qingdan.gui.adapter.MainTabFragmentPagerAdapter;
import lunioussky.qingdan.gui.widget.PagerDotIndicator;
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
    private PagerDotIndicator pagerDotIndicator;
    private TabLayout tabLayout;
    private ViewPager mainListFragmentViewPager;
    private MainTabFragmentPagerAdapter mainTabFragmentPagerAdapter;
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

        pagerDotIndicator = new PagerDotIndicator(getActivity(),mainSlideViewPager,mainIndicatorContainer);

        tabLayout = (TabLayout) getView().findViewById(R.id.tabLayout_main);
        mainListFragmentViewPager = (ViewPager) getView().findViewById(R.id.viewPager_main_fragment);
        tabLayout.setupWithViewPager(mainListFragmentViewPager);
    }



    @Override
    public void showBatchingData(ResponseBatching batching) {
        Toast.makeText(getActivity(), batching.getMessage(), Toast.LENGTH_SHORT).show();
        List<ResponseBatching.DataBean1.SlidesBean1.BodyBean.DataBean.SlidesBean> slides =
                batching.getData().getSlides().getBody().getData().getSlides();
        mainSlidePagerAdapter = new MainSlidePagerAdapter(getActivity(),slides);
        mainSlideViewPager.setAdapter(mainSlidePagerAdapter);
        pagerDotIndicator.setDotNums(slides.size());

        //设置下面的ViewPager和Tab
        mainTabFragmentPagerAdapter = new MainTabFragmentPagerAdapter(
                batching.getData().getChannels().getBody().getData().getChannels(),getFragmentManager());
        mainListFragmentViewPager.setAdapter(mainTabFragmentPagerAdapter);
    }

    @Override
    public void showLoadBatchingError() {
        Toast.makeText(getActivity(), "LoadBatchingError", Toast.LENGTH_SHORT).show();
    }
}
