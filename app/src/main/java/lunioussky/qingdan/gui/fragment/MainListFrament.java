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
import lunioussky.qingdan.entity.ResponseNodes;
import lunioussky.qingdan.gui.adapter.NodesRecyclerViewAdapter;
import lunioussky.qingdan.mvp.presenter.NodesPresenter;
import lunioussky.qingdan.mvp.presenter.impl.NodesPresenterImpl;
import lunioussky.qingdan.mvp.view.NodesView;

/**
 * Created by Administrator on 2016/12/2.
 */

public class MainListFrament extends BaseFragment implements NodesView {
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    private NodesPresenter nodesPresenter;
    private NodesRecyclerViewAdapter recyclerAdapter;

    @Override
    protected int getContentViewResId() {
        return R.layout.fragment_main_list;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        nodesPresenter = new NodesPresenterImpl(this);
        nodesPresenter.loadNextPageNodesData();

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        recyclerAdapter = new NodesRecyclerViewAdapter(getActivity());
        recyclerView.setAdapter(recyclerAdapter);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void showNodes(List<ResponseNodes.DataBean.NodesBean> nodes) {
        Log.d("MainListFrament", nodes.get(0).getTitle());
        recyclerAdapter.addDatas(nodes);
    }

    @Override
    public void showLoadFailed() {
        Log.d("MainListFrament", "showLoadFailed");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }
}
