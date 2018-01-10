package com.pineteree.mvp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.pineteree.mvp.demo1.EasyMvpActivity;
import com.pineteree.mvp.demo2.IntermediateActivity;
import com.pineteree.mvp.demo3.SeniorActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton1 = findViewById(R.id.easy_mvp);
        mButton2 = findViewById(R.id.intermediate_mvp);
        mButton3 = findViewById(R.id.senior_mvp);

        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.easy_mvp:
                startActivity(new Intent(this, EasyMvpActivity.class));
                break;
            case R.id.intermediate_mvp:
                startActivity(new Intent(this, IntermediateActivity.class));
                break;
            case R.id.senior_mvp:
                startActivity(new Intent(this, SeniorActivity.class));
                break;
        }
    }

}
