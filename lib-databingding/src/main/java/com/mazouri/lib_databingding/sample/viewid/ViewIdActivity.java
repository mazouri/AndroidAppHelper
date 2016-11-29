package com.mazouri.lib_databingding.sample.viewid;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.mazouri.lib_databingding.R;
import com.mazouri.lib_databingding.databinding.ActivityViewIdBinding;
import com.mazouri.lib_databingding.sample.BaseActivity;

public class ViewIdActivity extends BaseActivity {
    ActivityViewIdBinding activityViewIdBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityViewIdBinding = DataBindingUtil.setContentView(this, R.layout.activity_view_id);
    }

    public void showMyName(View view) {
        activityViewIdBinding.firstName.setText("wang");
        activityViewIdBinding.lastName.setText("dongdong");
    }
 }
