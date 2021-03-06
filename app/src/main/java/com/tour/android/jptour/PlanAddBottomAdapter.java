package com.tour.android.jptour;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by sung9 on 2017-02-03.
 */

public class PlanAddBottomAdapter extends RecyclerView.Adapter<PlanAddBottomAdapter.ViewHolder>{


    private Context context;
    private int len;

    public PlanAddBottomAdapter(Context _context, int _len){
        context = _context;
        len = _len;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_add_bottom_recycler, parent, false);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final int pos = position;
        ImageView.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context , PlanAddDetailActivity.class);
                context.startActivity(intent);
            }
        };
        holder.btn_bottom.setOnClickListener(listener);
    }

    @Override
    public int getItemCount() {
        return len;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView btn_bottom;

        public ViewHolder(View view) {
            super(view);
            btn_bottom = (ImageView) view.findViewById(R.id.add_bottom_item_btn);
        }
    }
}
