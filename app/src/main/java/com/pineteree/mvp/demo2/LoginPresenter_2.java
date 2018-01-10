package com.pineteree.mvp.demo2;


import com.pineteree.mvp.http.HttpUtils;

/**
 * Created by Administrator on 2018/1/8.
 */
//P层 中介
//持有M层的引用 持有V层引用
//泛型
public class LoginPresenter_2 extends BasePresenter_2<LoginView_2> {

    private LoginModel_2 mLoginModel;


    public LoginPresenter_2() {
        mLoginModel = new LoginModel_2();
    }


    public void login(String cat, int page) {
        this.mLoginModel.login(cat, page, new HttpUtils.OnHttpResultListener() {
            @Override
            public void onResult(String result) {
                if (getLoginView2() != null) {
                    getLoginView2().onLoginResult(result);
                }
            }
        });
    }


}
