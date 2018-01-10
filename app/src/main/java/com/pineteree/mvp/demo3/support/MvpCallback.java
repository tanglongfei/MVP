package com.pineteree.mvp.demo3.support;

import com.pineteree.mvp.demo3.MvpPresenter_3;
import com.pineteree.mvp.demo3.MvpView_3;

/**
 * Created by Administrator on 2018/1/9.
 */
//第二重代理->目标接口->绑定和解绑
public interface MvpCallback<V extends MvpView_3, P extends MvpPresenter_3<V>> {
    //绑定V层和解绑V层
    P createPresenter();

    V creatView();

    P getMvpPresenter();

    void setMvpPresenter(P presenter);

    V getMvpView();
}
