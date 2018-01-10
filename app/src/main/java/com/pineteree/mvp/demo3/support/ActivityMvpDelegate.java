package com.pineteree.mvp.demo3.support;

import android.os.Bundle;

import com.pineteree.mvp.demo3.MvpPresenter_3;
import com.pineteree.mvp.demo3.MvpView_3;

/**
 * Created by Administrator on 2018/1/9.
 */
//第一个代理->目标接口->代理Activity上面周期
public interface ActivityMvpDelegate<V extends MvpView_3, P extends MvpPresenter_3<V>> {

    void onCreate(Bundle savedInstanceState);

    void onStart();

    void onRestart();

    void onResume();

    void onPause();

    void onStop();

    void onDestory();
}
