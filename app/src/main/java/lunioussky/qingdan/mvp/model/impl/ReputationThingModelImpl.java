package lunioussky.qingdan.mvp.model.impl;

import android.util.Log;

import com.alibaba.fastjson.JSON;

import lunioussky.qingdan.entity.ResponseReputationThing;
import lunioussky.qingdan.mvp.model.ReputationThingModel;
import lunioussky.qingdan.utils.http.HttpUtils;
import lunioussky.qingdan.utils.http.Request;
import lunioussky.qingdan.utils.http.qingdan.HttpClient;

/**
 * Created by Administrator on 2016/11/7.
 * Model只负责获取指定Url的数据，不管理页数
 */

public class ReputationThingModelImpl implements ReputationThingModel {
    @Override
    public void loadData(String url, final Callback callback) {
        Request.Builder builder = new Request.Builder()
                .url(url)
                .get();
        Log.d("ReputationThingModelImp", "加载数据咯");
        HttpClient.excute(builder, new HttpUtils.Callback() {
            @Override
            public void onResponse(String response) {
                ResponseReputationThing responseReputationThing = JSON.parseObject(response, ResponseReputationThing.class);
                callback.loadSuccess(responseReputationThing.getData().getThings());

                if(responseReputationThing.getData().getMeta().getPagination().getTotal_pages() == 0){
                    callback.noSearchData();
                    return;
                }
                if(responseReputationThing.getData().getMeta().getPagination().getTotal_pages() ==
                        responseReputationThing.getData().getMeta().getPagination().getCurrent_page()
                        ){
                    callback.noMoreData();
                }
                Log.d("ReputationThingModelImp", "Success");
            }

            @Override
            public void onError() {
                callback.loadFailed();
                Log.d("ReputationThingModelImp", "error");
            }
        });
    }
}
