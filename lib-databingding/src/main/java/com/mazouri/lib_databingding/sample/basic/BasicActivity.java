package com.mazouri.lib_databingding.sample.basic;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.ActionBar;

import com.mazouri.lib_databingding.R;
import com.mazouri.lib_databingding.databinding.ActivityBasicBinding;
import com.mazouri.lib_databingding.model.User;
import com.mazouri.lib_databingding.sample.BaseActivity;

public class BasicActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_basic);
        ActivityBasicBinding  activityBasicBinding= DataBindingUtil.setContentView(this, R.layout.activity_basic);
        User user = new User("wang", "dongdong", 26);
        activityBasicBinding.setUser(user);
    }

    @Override
    protected void updateActionBar(ActionBar actionBar) {
        super.updateActionBar(actionBar);
    }
}
