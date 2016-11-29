package com.mazouri.lib_databingding.model;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by wangdongdong on 16-11-29.
 */

public class PlainUser {
    public final ObservableField<String> firstName = new ObservableField<>();
    public final ObservableField<String> lastName = new ObservableField<>();
    public final ObservableInt age = new ObservableInt();
}
