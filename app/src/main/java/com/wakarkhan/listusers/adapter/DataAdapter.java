package com.wakarkhan.listusers.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wakarkhan.listusers.model.User;
import com.wakarkhan.listusers.R;


import java.util.ArrayList;

/**
 * Created by wakar on 16/5/17.
 */



public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private ArrayList<User> userArrayList;

    public DataAdapter(ArrayList<User> userList) {
        userArrayList = userList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder holder, int position) {

        holder.tvFirst_name.setText(userArrayList.get(position).getFirst_name());
        holder.tvUsername.setText(userArrayList.get(position).getUsername());
        holder.tvEmail.setText(userArrayList.get(position).getEmail());
        holder.tvPhone.setText(userArrayList.get(position).getPhone());
    }

    @Override
    public int getItemCount() {
        return userArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvFirst_name,tvUsername,tvEmail,tvPhone;
        public ViewHolder(View view) {
            super(view);
            tvFirst_name = (TextView)view.findViewById(R.id.tv_name);
            tvUsername = (TextView)view.findViewById(R.id.tv_username);
            tvEmail = (TextView) view.findViewById(R.id.tv_email);
            tvPhone = (TextView)view.findViewById(R.id.tv_phone);
        }
    }
}
