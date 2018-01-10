package com.pineteree.mvp.demo3;

/**
 * Created by Administrator on 2018/1/9.
 */

public interface MvpPresenter_3<V extends MvpView_3> {
    void attachView(V view);
    void detachView();
}
