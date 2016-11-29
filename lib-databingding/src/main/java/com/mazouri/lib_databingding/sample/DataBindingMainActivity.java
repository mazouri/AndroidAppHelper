package com.mazouri.lib_databingding.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.mazouri.lib_databingding.R;
import com.mazouri.lib_databingding.sample.basic.BasicActivity;
import com.mazouri.lib_databingding.sample.observable.ObservableActivity;
import com.mazouri.lib_databingding.sample.resource.ResourceActivity;
import com.mazouri.lib_databingding.sample.viewid.ViewIdActivity;

public class DataBindingMainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_data_binding);

    }

    public void clickBasic(View view) {
        lunchByClass(BasicActivity.class);
    }

    public void clickObservable(View view) {
        lunchByClass(ObservableActivity.class);
    }

    public void clickResource(View view) {
        lunchByClass(ResourceActivity.class);
    }

    public void clickViewId(View view) {
        lunchByClass(ViewIdActivity.class);
    }


    private void lunchByClass(Class cls) {
        startActivity(new Intent(this, cls));
    }
}
