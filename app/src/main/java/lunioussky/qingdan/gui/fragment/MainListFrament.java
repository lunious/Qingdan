package lunioussky.qingdan.gui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import java.util.List;

import lunioussky.qingdan.R;
import lunioussky.qingdan.entity.ResponseNodes;
import lunioussky.qingdan.mvp.presenter.NodesPresenter;
import lunioussky.qingdan.mvp.presenter.impl.NodesPresenterImpl;
import lunioussky.qingdan.mvp.view.NodesView;

/**
 * Created by Administrator on 2016/12/2.
 */

public class MainListFrament extends BaseFragment implements NodesView {
    private NodesPresenter nodesPresenter;
    @Override
    protected int getContentViewResId() {
        return R.layout.fragment_main_list;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        nodesPresenter = new NodesPresenterImpl(this);
        nodesPresenter.loadNextPageNodesData();
    }

    @Override
    public void showNodes(List<ResponseNodes.DataBean.NodesBean> nodes) {
        Log.d("MainListFrament", nodes.get(0).getTitle());
    }

    @Override
    public void showLoadFailed() {
        Log.d("MainListFrament", "showLoadFailed");
    }
}
