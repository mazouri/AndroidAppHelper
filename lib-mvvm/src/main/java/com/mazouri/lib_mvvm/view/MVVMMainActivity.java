package com.mazouri.lib_mvvm.view;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mazouri.lib_mvvm.R;
import com.mazouri.lib_mvvm.databinding.ActivityMvvmmainBinding;
import com.mazouri.lib_mvvm.model.People;
import com.mazouri.lib_mvvm.viewmodel.PeopleViewModel;
import com.mazouri.lib_mvvm.viewmodel.PeopleViewModelContract;

import java.util.List;

public class MVVMMainActivity extends AppCompatActivity implements PeopleViewModelContract.MainView {

    private ActivityMvvmmainBinding activityMvvmmainBinding;
    private PeopleViewModelContract.MainView mainView = this;
    private PeopleViewModel peopleViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initDataBinding();
        setSupportActionBar(activityMvvmmainBinding.toolbar);
        setupListPeopleView(activityMvvmmainBinding.listPeople);
    }

    private void initDataBinding() {
        activityMvvmmainBinding = DataBindingUtil.setContentView(this, R.layout.activity_mvvmmain);
        peopleViewModel = new PeopleViewModel(mainView, getContext());
        activityMvvmmainBinding.setMainViewModel(peopleViewModel);
    }

    private void setupListPeopleView(RecyclerView listPeople) {
        PeopleAdapter adapter = new PeopleAdapter();
        listPeople.setAdapter(adapter);
        listPeople.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        peopleViewModel.destroy();
    }

    @Override
    public Context getContext() {
        return MVVMMainActivity.this;
    }

    @Override
    public void loadData(List<People> peoples) {
        PeopleAdapter peopleAdapter = (PeopleAdapter) activityMvvmmainBinding.listPeople.getAdapter();
        peopleAdapter.setPeopleList(peoples);
    }
}
