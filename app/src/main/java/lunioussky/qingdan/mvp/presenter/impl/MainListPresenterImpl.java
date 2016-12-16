package lunioussky.qingdan.mvp.presenter.impl;

import android.util.Log;

import java.util.List;

import lunioussky.qingdan.entity.ResponseMainListData;
import lunioussky.qingdan.mvp.model.MainListModel;
import lunioussky.qingdan.mvp.model.impl.MainListModelImpl;
import lunioussky.qingdan.mvp.presenter.MainListPresenter;
import lunioussky.qingdan.mvp.view.MainListView;
import lunioussky.qingdan.utils.UrlHandler;

/**
 * Created by Administrator on 2016/12/15.
 */

public class MainListPresenterImpl implements MainListPresenter{
    private MainListModel model;
    private MainListView view;
    private int nextPage = 1;
    private String urlTag;

    public MainListPresenterImpl(MainListView view,String urlTag) {
        this.view = view;
        this.urlTag = urlTag;
        model = new MainListModelImpl();
    }

    @Override
    public void loadNextPageDatas() {
        view.showRecycleViewFooterLoading();
        String url = UrlHandler.handlUrl(urlTag,nextPage);
        Log.d("MainListPresenterImpl", "正在获取第:" + nextPage + "页的数据");
        model.loadNextPageDatas(url, new MainListModel.CallBack() {
            @Override
            public void loadCollectionsSuccess(List<ResponseMainListData.DataBean.CollectionsBean> collections) {
                view.loadCollectionsSuccess(collections);
            }

            @Override
            public void loadNodesSuccess(List<ResponseMainListData.DataBean.NodesBean> nodes) {
                view.loadNodesSuccess(nodes);
            }

            @Override
            public void loadArticlesSuccess(List<ResponseMainListData.DataBean.ArticlesBean> articles) {
                view.loadArticlesSuccess(articles);
            }

            @Override
            public void loadFailed() {
                view.showRecycleViewFooterLoadFailed();
                nextPage--;
            }

            @Override
            public void noMoreData() {
                view.showRecycleViewFooterNoMoreData();
            }
        });
        nextPage++;
    }
}
