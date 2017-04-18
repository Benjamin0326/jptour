package com.tour.android.jptour;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by sung9 on 2017-02-03.
 */

public class PlanModifyAdapter extends RecyclerView.Adapter<PlanModifyAdapter.ViewHolder>{

    private String[] dummyData;
    private Context context;

    public PlanModifyAdapter(Context _context, String[] _dummyData){
        context = _context;
        dummyData = _dummyData;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_detail_plan, parent, false);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.plan_detail_tv.setText(dummyData[position]);
    }

    @Override
    public int getItemCount() {
        return dummyData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView plan_detail_tv;
        public ViewHolder(View view){
            super(view);
            plan_detail_tv = (TextView) view.findViewById(R.id.plan_detail_tv);
        }

    }
}
