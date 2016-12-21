package lunioussky.qingdan.mvp.view;


import java.util.List;

import lunioussky.qingdan.entity.ResponseReputationThing;

/**
 * Created by Administrator on 2016/11/7.
 */

public interface ReputationThingView {
    void showThingsToView(int page, List<ResponseReputationThing.DataBean.ThingsBean> things);

    void showFooterLoading();
    void showFooterLoadFailed();
    void showFooterNoMoreData();
    void showFooterNoSearchData();


}
