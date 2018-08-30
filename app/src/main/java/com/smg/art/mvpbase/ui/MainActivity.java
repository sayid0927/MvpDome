package com.smg.art.mvpbase.ui;

import com.blankj.utilcode.utils.ToastUtils;
import com.smg.art.mvpbase.R;
import com.smg.art.mvpbase.base.BaseActivity;
import com.smg.art.mvpbase.base.BasePresenter;
import com.smg.art.mvpbase.presenter.contract.activity.MainContract;
import com.smg.art.mvpbase.presenter.impl.activity.MainActivityPresenter;

public class MainActivity extends BaseActivity implements MainContract.View {

    MainActivityPresenter mPresenter = new MainActivityPresenter(this);

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void attachView() {
        mPresenter.attachView(this);
    }

    @Override
    public void detachView() {
        mPresenter.detachView();
    }

    @Override
    public void initView() {
        mPresenter.connect("account", "15118183011", "password", "000000");
    }

    @Override
    public void connectSuccess() {
        ToastUtils.showLongToast("VVVVVV");
    }

    @Override
    public void showError(String message) {

    }

}
