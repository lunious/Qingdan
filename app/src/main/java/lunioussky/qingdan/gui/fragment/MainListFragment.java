package lunioussky.qingdan.gui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import lunioussky.qingdan.R;
import lunioussky.qingdan.entity.ResponseMainListData;
import lunioussky.qingdan.gui.adapter.ArticlesRecyclerViewAdapter;
import lunioussky.qingdan.gui.adapter.BaseMainListRecyclerViewAdapter;
import lunioussky.qingdan.gui.adapter.CollectionsRecyclerViewAdapter;
import lunioussky.qingdan.gui.adapter.NodesRecyclerViewAdapter;
import lunioussky.qingdan.mvp.presenter.MainListPresenter;
import lunioussky.qingdan.mvp.presenter.impl.MainListPresenterImpl;
import lunioussky.qingdan.mvp.view.MainListView;
import lunioussky.qingdan.utils.Contants;

/**
 * Created by Administrator on 2016/12/2.
 */

public class MainListFragment extends BaseFragment implements MainListView{
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @Override
    protected int getContentViewResId() {
        return R.layout.fragment_main_list;
    }

     /****代表是哪一种数据类型*****/
    private int categoryTag;
    /****代表访问的数据接口*****/
    private String urlTag;
    private MainListPresenter presenter;
    private BaseMainListRecyclerViewAdapter recyclerViewAdapter;
    LinearLayoutManager layoutManager;
    public static MainListFragment newInstance(int categoryTag,String urlTag){
        MainListFragment fragment = new MainListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("categoryTag",categoryTag);
        bundle.putString("urlTag",urlTag);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        Bundle bundle = getArguments();
        categoryTag = bundle.getInt("categoryTag");
        urlTag = bundle.getString("urlTag");

        Log.d("MainListFragment", "categoryTag:" + categoryTag);
        Log.d("MainListFragment", "urlTag:" + urlTag);


        //根据数据类型来创建对应的adapter
        switch (categoryTag){
            case Contants.TAG_ARTICLES:
                recyclerViewAdapter = new ArticlesRecyclerViewAdapter(getActivity());
                break;
            case Contants.TAG_COLLECTIONS:
                recyclerViewAdapter = new CollectionsRecyclerViewAdapter(getActivity());
                break;
            case Contants.TAG_NODES:
                recyclerViewAdapter = new NodesRecyclerViewAdapter(getActivity());
                break;
        }
        recyclerViewAdapter.setOnRetryClickListener(new BaseMainListRecyclerViewAdapter.OnRetryClickListener() {
            @Override
            public void onRetryClick() {
                loadNextDatas();
            }
        });
        recyclerView.setAdapter(recyclerViewAdapter);

        recyclerView.addOnScrollListener(onScrollListener);

        //创建Presenter对象
        presenter = new MainListPresenterImpl(this,urlTag);
        loadNextDatas();

    }
    private void loadNextDatas(){
        presenter.loadNextPageDatas();
        isLoading = true;
    }
    private boolean isNoMoreData;
    private boolean isLoading;
    private RecyclerView.OnScrollListener onScrollListener = new RecyclerView.OnScrollListener() {
        @Override
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);
            //如果没有下一页数据就不再触发获取下一页数据
            if (isNoMoreData){
                return;
            }
            if (!isLoading && layoutManager.findLastVisibleItemPosition() == layoutManager.getItemCount() - 1){
                loadNextDatas();
            }
        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void loadNodesSuccess(List<ResponseMainListData.DataBean.NodesBean> nodes) {
        recyclerViewAdapter.addDatas(nodes);
        isLoading =false;
    }

    @Override
    public void loadArticlesSuccess(List<ResponseMainListData.DataBean.ArticlesBean> articles) {
        recyclerViewAdapter.addDatas(articles);
        isLoading =false;
    }

    @Override
    public void loadCollectionsSuccess(List<ResponseMainListData.DataBean.CollectionsBean> collections) {
        recyclerViewAdapter.addDatas(collections);
        isLoading = false;
    }

    @Override
    public void showRecycleViewFooterLoading() {
        recyclerViewAdapter.updateFooterViewState(BaseMainListRecyclerViewAdapter.STATE_LOADING);

    }

    @Override
    public void showRecycleViewFooterLoadFailed() {
        isLoading =false;
        recyclerViewAdapter.updateFooterViewState(BaseMainListRecyclerViewAdapter.STATE_FAILED);
    }

    @Override
    public void showRecycleViewFooterNoMoreData() {
        isNoMoreData = true;
        Toast.makeText(getActivity(), "没有更多数据了", Toast.LENGTH_SHORT).show();
        recyclerViewAdapter.updateFooterViewState(BaseMainListRecyclerViewAdapter.STATE_NO_MORE_DATA);
    }
}
