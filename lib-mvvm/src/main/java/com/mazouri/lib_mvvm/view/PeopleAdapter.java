package com.mazouri.lib_mvvm.view;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.mazouri.lib_mvvm.R;
import com.mazouri.lib_mvvm.databinding.ItemPeopleBinding;
import com.mazouri.lib_mvvm.model.People;
import com.mazouri.lib_mvvm.viewmodel.ItemPeopleViewModel;

import java.util.Collections;
import java.util.List;

/**
 * Created by wangdongdong on 16-11-29.
 */

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.PeopleAdapterViewHolder> {

    private List<People> peopleList;

    public PeopleAdapter() {
        this.peopleList = Collections.emptyList();
    }

    @Override
    public PeopleAdapter.PeopleAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemPeopleBinding itemPeopleBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_people, parent, false);
        return new PeopleAdapterViewHolder(itemPeopleBinding);
    }

    @Override
    public void onBindViewHolder(PeopleAdapter.PeopleAdapterViewHolder holder, int position) {
        holder.bindPeople(peopleList.get(position));
    }

    @Override
    public int getItemCount() {
        return peopleList.size();
    }

    public void setPeopleList(List<People> peopleList) {
        this.peopleList = peopleList;
        notifyDataSetChanged();
    }

    public static class PeopleAdapterViewHolder extends RecyclerView.ViewHolder {
        ItemPeopleBinding mItemPeopleBinding;

        public PeopleAdapterViewHolder(ItemPeopleBinding itemPeopleBinding) {
            super(itemPeopleBinding.itemPeople);
            this.mItemPeopleBinding = itemPeopleBinding;
        }

        void bindPeople(People people) {
            if (mItemPeopleBinding.getPeopleViewModel() == null) {
                mItemPeopleBinding.setPeopleViewModel(
                        new ItemPeopleViewModel(people, itemView.getContext()));
            } else {
                mItemPeopleBinding.getPeopleViewModel().setPeople(people);
            }
        }
    }
}
