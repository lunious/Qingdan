package lunioussky.qingdan.mvp.presenter.impl;

import android.text.TextUtils;
import android.util.Log;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import lunioussky.qingdan.entity.ResponseReputationThing;
import lunioussky.qingdan.mvp.model.ReputationThingModel;
import lunioussky.qingdan.mvp.model.impl.ReputationThingModelImpl;
import lunioussky.qingdan.mvp.presenter.ReputationThingPresenter;
import lunioussky.qingdan.mvp.view.ReputationThingView;
import lunioussky.qingdan.utils.Apis;
import lunioussky.qingdan.utils.Contants;
import lunioussky.qingdan.utils.UrlHandler;


/**
 * Created by Administrator on 2016/11/7.
 */

public class ReputationThingPresenterImpl implements ReputationThingPresenter, ReputationThingModel.Callback {
    private ReputationThingModel model;
    private ReputationThingView view;

    private int sortTag;
    private int nextPage = 1;
    private int rankingId;
    public ReputationThingPresenterImpl(ReputationThingView view, int sortTag, int rankingId) {
        this.view = view;
        this.sortTag = sortTag;
        this.rankingId = rankingId;
        this.model = new ReputationThingModelImpl();
    }

    @Override
    public void loadNextData(String key) {
        if(!TextUtils.isEmpty(key)){
            try {
                key = URLEncoder.encode(key,"utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }else{
            key = "";
        }
        String url = "";
        switch (sortTag){
            case Contants.SORT_BY_REVIEW_COUNT:
                url = UrlHandler.handlUrl(Apis.API_REPUTATION_THING_SORT_BY_REVIEW_COUNT,rankingId,key,nextPage);
                break;
            case Contants.SORT_BY_rating_score:
                url = UrlHandler.handlUrl(Apis.API_REPUTATION_THING_SORT_BY_rating_score,rankingId,key,nextPage);
                break;
            case Contants.SORT_BY_BRAND_NAME:
                url = UrlHandler.handlUrl(Apis.API_REPUTATION_THING_SORT_BY_BRAND_NAME,rankingId,key,nextPage);
                break;
        }
        model.loadData(url,this);
        Log.d("ReputationThingPresente", url);
        view.showFooterLoading();
    }

    @Override
    public void refreshData(String key) {
        nextPage = 1;
        loadNextData(key);
    }

    @Override
    public void loadSuccess(List<ResponseReputationThing.DataBean.ThingsBean> things) {
        view.showThingsToView(nextPage,things);
        nextPage++;
        Log.d("ReputationThingPresente", "success");
    }

    @Override
    public void loadFailed() {
        view.showFooterLoadFailed();
    }

    @Override
    public void noMoreData() {
        view.showFooterNoMoreData();
    }

    @Override
    public void noSearchData() {
        view.showFooterNoSearchData();
    }
}
