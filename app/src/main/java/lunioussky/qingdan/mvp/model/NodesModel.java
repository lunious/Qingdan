package lunioussky.qingdan.mvp.model;

import java.util.List;

import lunioussky.qingdan.entity.ResponseNodes;

/**
 * Created by 11645 on 2016/12/9.
 */

public interface NodesModel {

    void loadNextPageNodesData(NodesCallBack callBack);

    public interface NodesCallBack{
        void loadNodesSuccess(List<ResponseNodes.DataBean.NodesBean> nodes);
        void loadNodesFailed();
    }

}
