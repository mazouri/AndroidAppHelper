package com.mazouri.lib_mvvm;

import android.content.Context;

import com.mazouri.lib_mvvm.data.PeopleFactory;
import com.mazouri.lib_mvvm.data.PeopleService;

import rx.Scheduler;
import rx.schedulers.Schedulers;

/**
 * Created by wangdongdong on 16-11-29.
 */

public class MVVMApplication {
    private static MVVMApplication mInstance;
    private Context mContext;

    public static synchronized MVVMApplication getInstance() {
        if(null == mInstance){
            mInstance = new MVVMApplication();
        }
        return mInstance;
    }

    private MVVMApplication() { }

    public void onCreate(Context context) {
        mContext = context.getApplicationContext();
    }

    private PeopleService peopleService;
    private Scheduler scheduler;

    public PeopleService getPeopleService() {
        if (peopleService == null) peopleService = PeopleFactory.create();

        return peopleService;
    }

    public Scheduler subscribeScheduler() {
        if (scheduler == null) scheduler = Schedulers.io();

        return scheduler;
    }

    public void setPeopleService(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    public void setScheduler(Scheduler scheduler) {
        this.scheduler = scheduler;
    }
}
