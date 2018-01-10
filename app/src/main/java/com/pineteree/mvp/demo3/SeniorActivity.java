package com.pineteree.mvp.demo3;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.pineteree.mvp.R;
//双重代理
public class SeniorActivity extends MvpActivity_3<LoginView_3, LoginPresenter_3> implements
        LoginView_3 {
    Button mButton;


    @Override
    public LoginPresenter_3 createPresenter() {
        return new LoginPresenter_3();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senior);
        mButton = findViewById(R.id.bt);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            getMvpPresenter().login("前端",1);
            }
        });
    }



    @Override
    public void onLoginResult(String result) {
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
    }
}
