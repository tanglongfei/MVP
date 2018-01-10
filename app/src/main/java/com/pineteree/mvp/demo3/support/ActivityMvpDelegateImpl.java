package com.pineteree.mvp.demo3.support;

import android.os.Bundle;

import com.pineteree.mvp.demo3.MvpPresenter_3;
import com.pineteree.mvp.demo3.MvpView_3;

/**
 * Created by Administrator on 2018/1/9.
 */
//第一个代理->目标对象->代理生命周期->就是重写了Android的Framework层
public class ActivityMvpDelegateImpl<V extends MvpView_3, P extends MvpPresenter_3<V>> implements
        ActivityMvpDelegate<V, P> {

    //说白了，这个就是一个Activity的引用
    private ProxyMvpCallback<V, P> mProxyMvpCallback;

    public ActivityMvpDelegateImpl(MvpCallback<V, P> mvpCallback) {
        mProxyMvpCallback = new ProxyMvpCallback<>(mvpCallback);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        mProxyMvpCallback.createPresenter();
        mProxyMvpCallback.creatView();
        mProxyMvpCallback.attachView();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onRestart() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onDestory() {
        mProxyMvpCallback.detachView();
    }
}
