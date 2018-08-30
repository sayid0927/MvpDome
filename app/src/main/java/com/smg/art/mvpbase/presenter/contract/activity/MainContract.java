
package com.smg.art.mvpbase.presenter.contract.activity;


import com.smg.art.mvpbase.base.BaseContract;

public interface MainContract {

    interface View extends BaseContract.BaseView {
        /**
         * 建立与融云服务器的连接成功
         */
        void connectSuccess();

    }

    interface Presenter<T> extends BaseContract.BasePresenter<T> {

        /**
         * 建立与融云服务器的连接
         */
        void connect(String ...s);

    }
}
