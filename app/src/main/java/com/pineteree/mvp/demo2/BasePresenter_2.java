package com.pineteree.mvp.demo2;

/**
 * Created by Administrator on 2018/1/8.
 */

public class BasePresenter_2<V extends MvpView_2> {
    private V mLoginView2;

    public V getLoginView2() {
        return mLoginView2;
    }

    //绑定V层
    public void attachView(V loginView) {
        this.mLoginView2 = loginView;
    }

    //解绑V层
    public void detachView() {
        this.mLoginView2 = null;
    }
}
