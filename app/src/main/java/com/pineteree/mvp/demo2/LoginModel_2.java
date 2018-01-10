package com.pineteree.mvp.demo2;

import com.pineteree.mvp.http.Constant;
import com.pineteree.mvp.http.GankModel;
import com.pineteree.mvp.http.HttpManager;
import com.pineteree.mvp.http.HttpUtils;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Administrator on 2018/1/8.
 */
//M层->数据成->网络
public class LoginModel_2 {

    public void login(String category, int page, final HttpUtils.OnHttpResultListener
            onHttpResultListener) {

        HttpManager.getInstance().getApiService()
                .getCategoryData(category, Constant.PAGE_SIZE, page)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<GankModel>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(GankModel gankModel) {
                        onHttpResultListener.onResult("请求成功，ID：" + gankModel.getResults().get(0)
                                .get_id());
                    }

                    @Override
                    public void onError(Throwable e) {
                        onHttpResultListener.onResult("请求失败，" + e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

}
