package lunioussky.qingdan.mvp.view;

import java.util.List;

import lunioussky.qingdan.entity.ResponseNodes;

/**
 * Created by 11645 on 2016/12/9.
 */

public interface NodesView {
    void showNodes(List<ResponseNodes.DataBean.NodesBean> nodes);
    void showLoadFailed();
}
