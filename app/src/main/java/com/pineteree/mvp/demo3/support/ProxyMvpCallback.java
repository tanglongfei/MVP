package com.pineteree.mvp.demo3.support;


import com.pineteree.mvp.demo3.MvpPresenter_3;
import com.pineteree.mvp.demo3.MvpView_3;

/**
 * Created by Administrator on 2018/1/9.
 */
//第二个代理->代理对象
public class ProxyMvpCallback<V extends MvpView_3, P extends MvpPresenter_3<V>> implements
        MvpCallback<V, P> {
    //实现绑定和解绑的高度抽象

    private MvpCallback<V, P> mvpCallback;

    public ProxyMvpCallback(MvpCallback<V, P> mvpCallback) {
        this.mvpCallback = mvpCallback;
    }


    @Override
    public P createPresenter() {
        //创建P层
        P presenter = this.mvpCallback.getMvpPresenter();
        if (presenter == null) {
            presenter = this.mvpCallback.createPresenter();
        }
        if (presenter == null) {
            throw new NullPointerException("presenter不能为空!");
        }
        this.mvpCallback.setMvpPresenter(presenter);
        return presenter;
    }

    @Override
    public V creatView() {
        //创建V层
        V view = this.mvpCallback.getMvpView();
        if (view == null) {
            view = this.mvpCallback.creatView();
        }
        if (view == null) {
            throw new NullPointerException("view不能为空!");
        }
        return view;
    }


    @Override
    public P getMvpPresenter() {
        return this.mvpCallback.getMvpPresenter();
    }

    @Override
    public void setMvpPresenter(P presenter) {
        this.mvpCallback.setMvpPresenter(presenter);
    }

    @Override
    public V getMvpView() {
        return this.mvpCallback.getMvpView();
    }

    //实现绑定和解绑的高度抽象
    public void attachView() {
        this.getMvpPresenter().attachView(getMvpView());
    }

    public void detachView() {
        this.getMvpPresenter().detachView();
    }

}
