package com.pineteree.mvp.demo1;


import com.pineteree.mvp.http.HttpUtils;

/**
 * Created by Administrator on 2018/1/8.
 */
//P层 中介
//持有M层的引用 持有V层引用
public class LoginPresenter {

    private LoginModel mLoginModel;
    private LoginView mLoginView;

    public LoginPresenter() {
        mLoginModel = new LoginModel();

    }

    //绑定V层
    public void attachView(LoginView loginView) {
        this.mLoginView = loginView;
    }

    //解绑V层
    public void detachView() {
        this.mLoginView = null;
    }

    public void login(String cat, int page) {
        this.mLoginModel.login(cat, page, new HttpUtils.OnHttpResultListener() {
            @Override
            public void onResult(String result) {
                if (mLoginView != null) {
                    mLoginView.onLoginResult(result);
                }
            }
        });
    }


}
