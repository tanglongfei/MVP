package com.pineteree.mvp.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.pineteree.mvp.R;

/**
 * 泛型设计
 * 作者：tlf
 */
public class IntermediateActivity extends BaseActivity<LoginView_2, LoginPresenter_2> implements
        LoginView_2 {
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate);
        mButton = findViewById(R.id.bt1);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getPresenter2().login("前端", 1);
            }
        });
    }

    @Override
    public LoginPresenter_2 createPresenter() {
        return new LoginPresenter_2();
    }


    @Override
    public void onLoginResult(String result) {
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
    }
}
