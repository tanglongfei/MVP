package com.pineteree.mvp.demo2;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by Administrator on 2018/1/8.
 */

public abstract class BaseActivity<V extends MvpView_2, P extends BasePresenter_2<V>> extends
        Activity
        implements MvpView_2 {
    private P mPresenter2;

    public P getPresenter2() {
        return mPresenter2;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (mPresenter2 == null) {
            mPresenter2 = createPresenter();
        }
        if (mPresenter2 != null) {
            mPresenter2.attachView((V) this);
        }

    }

    public abstract P createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter2 != null) {
            mPresenter2.detachView();
        }
    }
}
