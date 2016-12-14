package lunioussky.qingdan.mvp.model;

import java.util.List;

import lunioussky.qingdan.entity.ResponseMainListData;

/**
 * Created by 11645 on 2016/12/15.
 */

public interface MainListModel {
    void loadNextPageDatas(CallBack callBack);

    public interface CallBack{
        void loadCollectionsSuccess(List<ResponseMainListData.DataBean.CollectionsBean> collections);
        void loadNodesSuccess(List<ResponseMainListData.DataBean.NodesBean> nodes);
        void loadArticlesSuccess(List<ResponseMainListData.DataBean.ArticlesBean> articles);
        void noMoreData();
        void loadFailed(int page);
    }
}
