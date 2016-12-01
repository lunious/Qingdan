package lunioussky.qingdan.gui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.widget.Toast;

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
    }

    @Override
    public void showBatchingData(ResponseBatching batching) {
        Toast.makeText(getActivity(), batching.getMessage(), Toast.LENGTH_SHORT).show();
        mainSlidePagerAdapter = new MainSlidePagerAdapter(getActivity(),
                batching.getData().getSlides().getBody().getData().getSlides());
        mainSlideViewPager.setAdapter(mainSlidePagerAdapter  );
    }

    @Override
    public void showLoadBatchingError() {
        Toast.makeText(getActivity(), "LoadBatchingError", Toast.LENGTH_SHORT).show();
    }
}
