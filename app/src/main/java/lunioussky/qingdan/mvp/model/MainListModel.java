package lunioussky.qingdan.mvp.model;

import java.util.List;

import lunioussky.qingdan.entity.ResponseMainListData;
import lunioussky.qingdan.entity.ResponseReputation;

/**
 * Created by 11645 on 2016/12/15.
 */

public interface MainListModel {
    void loadNextPageDatas(String url,CallBack callBack);

    public interface CallBack{
        void loadCollectionsSuccess(List<ResponseMainListData.DataBean.CollectionsBean> collections);
        void loadNodesSuccess(List<ResponseMainListData.DataBean.NodesBean> nodes);
        void loadArticlesSuccess(List<ResponseMainListData.DataBean.ArticlesBean> articles);
        void loadFailed();
        void noMoreData();


    }
    void loadReputationData(ReputationCallBack callBack);
    public interface ReputationCallBack{
        void loadSuccess(List<ResponseReputation.DataBean.RankingsBean> rankings);
        void loadFailed();
    }
}
