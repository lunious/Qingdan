package lunioussky.qingdan.mvp.view;

import lunioussky.qingdan.entity.ResponseBatching;

/**
 * Created by Administrator on 2016/12/1.
 */

public interface MainView {
    void showBatchingData(ResponseBatching batching);
    void showLoadBatchingError();
}
