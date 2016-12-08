package lunioussky.qingdan.mvp.presenter.impl;

import lunioussky.qingdan.entity.ResponseBatching;
import lunioussky.qingdan.mvp.model.MainModel;
import lunioussky.qingdan.mvp.model.impl.MainModelImpl;
import lunioussky.qingdan.mvp.presenter.MainPresenter;
import lunioussky.qingdan.mvp.view.MainView;

/**
 * Created by Administrator on 2016/12/1.
 */

public class MainPresenterImpl implements MainPresenter {
    private MainModel mainModel;
    private MainView mainView;
    public MainPresenterImpl(MainView mainView) {
        this.mainModel = new MainModelImpl();
        this.mainView = mainView;
    }

    @Override
    public void loadBatching() {
        //Presenter通过Model去加载数据
        mainModel.loadDatas(new MainModel.OnBatchingLoadCallback() {
            @Override
            public void onBatchingLoadSuccess(ResponseBatching batching) {
                mainView.showBatchingData(batching);
            }

            @Override
            public void onBatchingLoadFailed() {
                mainView.showLoadBatchingError();
            }
        });
    }
}
