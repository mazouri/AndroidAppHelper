package com.mazouri.lib_databingding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mazouri.lib_databingding.databinding.ActivityDataBindingBinding;
import com.mazouri.lib_databingding.model.User;

public class DataBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDataBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding);

        User user = new User("ma", "zouri");
        binding.setUser(user);

    }
}
