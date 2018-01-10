package com.pineteree.mvp.demo3;

/**
 * Created by Administrator on 2018/1/8.
 */

public class MvpBasePresenter_3<V extends MvpView_3> implements MvpPresenter_3<V> {
    private V mLoginView3;

    public V getLoginView3() {
        return mLoginView3;
    }

    @Override
    public void attachView(V view) {
        mLoginView3 = view;
    }

    @Override
    public void detachView() {
        mLoginView3 = null;
    }
}
