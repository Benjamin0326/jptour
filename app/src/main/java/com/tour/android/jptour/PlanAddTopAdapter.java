package com.tour.android.jptour;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by sung9 on 2017-02-03.
 */

public class PlanAddTopAdapter extends RecyclerView.Adapter<PlanAddTopAdapter.ViewHolder>{


    private Context context;
    private int len;

    public PlanAddTopAdapter(Context _context, int _len){
        context = _context;
        len = _len;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_add_top_recycler, parent, false);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return len;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(View view){
            super(view);
        }

    }
}
