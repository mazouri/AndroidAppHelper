package com.mazouri.apphelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mazouri.lib_databingding.DataBindingActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_data_bind)
    public void clickDataBind() {
        lunchActivityByClass(DataBindingActivity.class);
    }

    private void lunchActivityByClass(Class targetClass) {
        Intent intent = new Intent(this, targetClass);
        lunchActivityByIntent(intent);
    }

    protected void lunchActivityByIntent(Intent intent) {
        this.startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}
