package com.mazouri.lib_databingding.sample.resource;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.mazouri.lib_databingding.R;
import com.mazouri.lib_databingding.databinding.ResourceBinding;
import com.mazouri.lib_databingding.sample.BaseActivity;

public class ResourceActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ResourceBinding resourceBinding = DataBindingUtil.setContentView(this, R.layout.activity_resource);
        resourceBinding.setFirstName("wang");
        resourceBinding.setLastName("dongdong");
        resourceBinding.setLarge(true);
        resourceBinding.setBananaCount(5);
        resourceBinding.setOrangeCount(10);
    }
}
