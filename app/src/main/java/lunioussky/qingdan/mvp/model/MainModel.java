package lunioussky.qingdan.mvp.model;

import lunioussky.qingdan.entity.ResponseBatching;

/**
 * Created by Administrator on 2016/12/1.
 */

public interface MainModel {
    void loadDatas(OnBatchingLoadCallback callback);
    public interface OnBatchingLoadCallback{
        void onBatchingLoadSuccess(ResponseBatching batching);
        void onBatchingLoadFailed();
    }
}
