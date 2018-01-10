package com.pineteree.mvp.demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.Toast;

import com.pineteree.mvp.R;
import com.pineteree.mvp.http.Constant;
import com.pineteree.mvp.http.GankModel;
import com.pineteree.mvp.http.HttpManager;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * 简单MVP
 * 作者 :tlf
 */
//V层->UI层
//持有P层引用
public class EasyMvpActivity extends AppCompatActivity implements LoginView {
    Button mButton;
    private LoginPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_mvp);
        mPresenter = new LoginPresenter();
        mPresenter.attachView(this);
        mButton = findViewById(R.id.bt);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.login("前端", 1);
            }
        });
    }

    @Override
    public void onLoginResult(String result) {
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }

}
