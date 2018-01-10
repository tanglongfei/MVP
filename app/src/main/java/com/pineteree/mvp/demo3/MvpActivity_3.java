package com.pineteree.mvp.demo3;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.pineteree.mvp.demo3.support.ActivityMvpDelegate;
import com.pineteree.mvp.demo3.support.ActivityMvpDelegateImpl;
import com.pineteree.mvp.demo3.support.MvpCallback;

/**
 * Created by Administrator on 2018/1/8.
 */
//第一个代理->代理对象->1.持有目标对象的引用 2.实现目标接口（不一定）
// 第二个代理->目标对象
public abstract class MvpActivity_3<V extends MvpView_3, P extends MvpPresenter_3<V>> extends
        Activity
        implements MvpView_3, MvpCallback<V, P> {

    private ActivityMvpDelegate<V, P> mActivityMvpDelegate;

    public ActivityMvpDelegate<V, P> getActivityMvpDelegate() {
        if (mActivityMvpDelegate == null) {
            mActivityMvpDelegate = new ActivityMvpDelegateImpl<>(this);
        }
        return mActivityMvpDelegate;
    }

    private P presenter;

    @Override
    public abstract P createPresenter();

    @Override
    public V creatView() {
        return (V) this;
    }

    @Override
    public P getMvpPresenter() {
        return presenter;
    }

    @Override
    public void setMvpPresenter(P presenter) {
        this.presenter = presenter;
    }

    @Override
    public V getMvpView() {
        return (V) this;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivityMvpDelegate().onCreate(savedInstanceState);
    }


    @Override
    protected void onStart() {
        super.onStart();
        getActivityMvpDelegate().onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        getActivityMvpDelegate().onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        getActivityMvpDelegate().onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
        getActivityMvpDelegate().onStop();
    }

    @Override
    protected void onPause() {
        super.onPause();
        getActivityMvpDelegate().onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        getActivityMvpDelegate().onDestory();
    }
}
