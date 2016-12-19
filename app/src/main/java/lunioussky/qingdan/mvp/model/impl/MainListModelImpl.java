package lunioussky.qingdan.mvp.model.impl;

import android.util.Log;

import com.alibaba.fastjson.JSON;

import lunioussky.qingdan.entity.ResponseMainListData;
import lunioussky.qingdan.entity.ResponseReputation;
import lunioussky.qingdan.mvp.model.MainListModel;
import lunioussky.qingdan.utils.Apis;
import lunioussky.qingdan.utils.http.HttpUtils;
import lunioussky.qingdan.utils.http.Request;
import lunioussky.qingdan.utils.http.qingdan.HttpClient;

/**
 * Created by 11645 on 2016/12/15.
 */

public class MainListModelImpl implements MainListModel {

    @Override
    public void loadNextPageDatas(String url,final CallBack callBack) {
        Request.Builder builder = new Request.Builder()
                .url(url)
                .get();
        HttpClient.excute(builder, new HttpUtils.Callback() {
            @Override
            public void onResponse(String response) {
                Log.d("MainListModelImpl", response);
                ResponseMainListData responseMainListData = JSON.parseObject(response,ResponseMainListData.class);
                if (responseMainListData.getData().getMeta().getPagination().getTotal_pages() ==
                        responseMainListData.getData().getMeta().getPagination().getCurrent_page()){
                    callBack.noMoreData();
                }

                //根据返回的数据，判断访问得到的是哪一种类型的数据
                if (responseMainListData.getData().getArticles() != null){
                    callBack.loadArticlesSuccess(responseMainListData.getData().getArticles());
                }else if (responseMainListData.getData().getCollections() != null){
                    callBack.loadCollectionsSuccess(responseMainListData.getData().getCollections());
                }else if (responseMainListData.getData().getNodes() != null){
                    callBack.loadNodesSuccess(responseMainListData.getData().getNodes());
                }
            }

            @Override
            public void onError() {
                callBack.loadFailed();
            }
        });
    }

    @Override
    public void loadReputationData(final ReputationCallBack callBack) {
        Request.Builder builder = new Request.Builder()
                .get()
                .url(Apis.URL_REPUTATION);
        HttpClient.excute(builder, new HttpUtils.Callback() {
            @Override
            public void onResponse(String response) {
                ResponseReputation responseReputation = JSON.parseObject(response, ResponseReputation.class);
                if (responseReputation.getCode() == 0){//code = 0 代表访问成功
                    callBack.loadSuccess(responseReputation.getData().getRankings());
                }
            }

            @Override
            public void onError() {

            }
        });
    }

}
