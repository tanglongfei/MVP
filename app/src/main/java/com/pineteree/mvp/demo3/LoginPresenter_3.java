package com.pineteree.mvp.demo3;


import com.pineteree.mvp.http.HttpUtils;

/**
 * Created by Administrator on 2018/1/8.
 */
//P层 中介
//持有M层的引用 持有V层引用
//泛型
public class LoginPresenter_3 extends MvpBasePresenter_3<LoginView_3> {

    private LoginModel_3 mLoginModel;


    public LoginPresenter_3() {
        mLoginModel = new LoginModel_3();
    }


    public void login(String cat, int page) {
        this.mLoginModel.login(cat, page, new HttpUtils.OnHttpResultListener() {
            @Override
            public void onResult(String result) {
                if (getLoginView3() != null) {
                    getLoginView3().onLoginResult(result);
                }
            }
        });
    }


}
