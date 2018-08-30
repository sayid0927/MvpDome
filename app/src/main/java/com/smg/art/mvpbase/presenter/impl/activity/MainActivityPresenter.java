
package com.smg.art.mvpbase.presenter.impl.activity;


import com.smg.art.mvpbase.api.Api;
import com.smg.art.mvpbase.base.BaseActivity;
import com.smg.art.mvpbase.base.BasePresenter;
import com.smg.art.mvpbase.bean.LoginBean;
import com.smg.art.mvpbase.presenter.contract.activity.MainContract;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivityPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter<MainContract.View> {

    public MainActivityPresenter(BaseActivity context) {
        super(context);
    }

    @Override
    public void connect(String... s) {
        mContext.showWaitingDialog("加载中...");
        addSubscrebe(Api.getInstance().FetchLogin(s).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<LoginBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        mContext.hideWaitingDialog();
                        mView.showError(e.getMessage());
                    }

                    @Override
                    public void onNext(LoginBean data) {
                        mContext.hideWaitingDialog();
                        if (mView != null && data != null) {

                        }
                    }
                }));
    }
}
