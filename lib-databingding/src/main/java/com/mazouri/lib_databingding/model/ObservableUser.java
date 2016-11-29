package com.mazouri.lib_databingding.model;


import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.mazouri.lib_databingding.BR;

/**
 * Created by wangdongdong on 16-11-29.
 */

public class ObservableUser extends BaseObservable {
    private String firstName;
    private String lastName;

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }
}
