package lunioussky.qingdan.mvp.model;

import java.util.List;

import lunioussky.qingdan.entity.ResponseReputationThing;

/**
 * Created by Administrator on 2016/11/7.
 */

public interface ReputationThingModel {
    void loadData(String url, Callback callback);
    public interface Callback{
        void loadSuccess(List<ResponseReputationThing.DataBean.ThingsBean> things);
        void loadFailed();
        void noMoreData();
        void noSearchData();

    }
}
