package lunioussky.qingdan.mvp.view;

import java.util.List;

import lunioussky.qingdan.entity.ResponseMainListData;
import lunioussky.qingdan.entity.ResponseReputation;

/**
 * Created by Administrator on 2016/12/15.
 */

public interface MainListView {
    void loadNodesSuccess(List<ResponseMainListData.DataBean.NodesBean> nodes);
    void loadArticlesSuccess(List<ResponseMainListData.DataBean.ArticlesBean> articles);
    void loadCollectionsSuccess(List<ResponseMainListData.DataBean.CollectionsBean> collections);

    void showRecycleViewFooterLoading();
    void showRecycleViewFooterLoadFailed();
    void showRecycleViewFooterNoMoreData();


    void showReputation(List<ResponseReputation.DataBean.RankingsBean> rankings);
}
