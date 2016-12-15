package lunioussky.qingdan.gui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import lunioussky.qingdan.R;
import lunioussky.qingdan.entity.ResponseMainListData;
import lunioussky.qingdan.gui.adapter.NodesRecyclerViewAdapter;
import lunioussky.qingdan.mvp.presenter.MainListPresenter;
import lunioussky.qingdan.mvp.presenter.impl.MainListPresenterImpl;
import lunioussky.qingdan.mvp.view.MainListView;

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
    private NodesRecyclerViewAdapter recyclerViewAdapter;

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

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        Bundle bundle = getArguments();
        categoryTag = bundle.getInt("categoryTag");
        urlTag = bundle.getString("urlTag");

        Log.d("MainListFragment", "categoryTag:" + categoryTag);
        Log.d("MainListFragment", "urlTag:" + urlTag);
        //创建Presenter对象
        presenter = new MainListPresenterImpl(this,urlTag);
        presenter.loadNextPageDatas();

        recyclerViewAdapter = new NodesRecyclerViewAdapter(getActivity());
        recyclerView.setAdapter(recyclerViewAdapter);

    }
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
    }

    @Override
    public void loadArticlesSuccess(List<ResponseMainListData.DataBean.ArticlesBean> articles) {
        Log.d("MainListFragment", "Articles:"+articles.get(0).getTitle());
    }

    @Override
    public void loadCollectionsSuccess(List<ResponseMainListData.DataBean.CollectionsBean> collections) {
        Log.d("MainListFragment", "Collections:"+ collections.get(0).getTitle());
    }

    @Override
    public void showRecycleViewFooterLoading() {

    }

    @Override
    public void showRecycleViewFooterLoadFailed() {

    }

    @Override
    public void showRecycleViewFooterNoMoreData() {

    }
}
