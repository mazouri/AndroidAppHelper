package com.mazouri.lib_databingding.sample.observable;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.mazouri.lib_databingding.R;
import com.mazouri.lib_databingding.databinding.ActivityObservaleBinding;
import com.mazouri.lib_databingding.model.ObservableUser;
import com.mazouri.lib_databingding.model.PlainUser;
import com.mazouri.lib_databingding.sample.BaseActivity;

public class ObservableActivity extends BaseActivity {
    private ObservableUser oUser = new ObservableUser();
    private PlainUser pUser = new PlainUser();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_observale);
        ActivityObservaleBinding activityObservaleBinding = DataBindingUtil.setContentView(this, R.layout.activity_observale);

        setUsers();
        activityObservaleBinding.setOUser(oUser);
        activityObservaleBinding.setPUser(pUser);
    }

    private void setUsers() {
        oUser.setFirstName("wang");
        oUser.setLastName("dongdong");

        pUser.firstName.set("wang");
        pUser.lastName.set("dongdong");
        pUser.age.set(26);
    }

    public void setMyName(View view) {
        oUser.setFirstName("wang");
        oUser.setLastName("dongdong");

        pUser.firstName.set("wang");
        pUser.lastName.set("dongdong");
        pUser.age.set(26);
    }

    public void setOtherName(View view) {
        oUser.setFirstName("Da");
        oUser.setLastName("zhangwei");

        pUser.firstName.set("Da");
        pUser.lastName.set("zhangwei");
        pUser.age.set(17);
    }
}
