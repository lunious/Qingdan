package lunioussky.qingdan.mvp.presenter.impl;

import java.util.List;

import lunioussky.qingdan.entity.ResponseNodes;
import lunioussky.qingdan.mvp.model.NodesModel;
import lunioussky.qingdan.mvp.model.impl.NodesModelImpl;
import lunioussky.qingdan.mvp.presenter.NodesPresenter;
import lunioussky.qingdan.mvp.view.NodesView;

/**
 * Created by 11645 on 2016/12/9.
 */

public class NodesPresenterImpl implements NodesPresenter {
    private NodesModel nodesModel;
    private NodesView nodesView;

    public NodesPresenterImpl(NodesView nodesView) {
        nodesModel = new NodesModelImpl();
        this.nodesView = nodesView;
    }



    @Override
    public void loadNextPageNodesData() {
        nodesModel.loadNextPageNodesData(new NodesModel.NodesCallBack() {
            @Override
            public void loadNodesSuccess(List<ResponseNodes.DataBean.NodesBean> nodes) {
                nodesView.showNodes(nodes);
            }
            @Override
            public void loadNodesFailed() {
                nodesView.showLoadFailed();
            }
        });
    }
}
