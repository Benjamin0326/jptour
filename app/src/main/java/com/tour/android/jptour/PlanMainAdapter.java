package com.tour.android.jptour;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by sung9 on 2017-02-03.
 */

public class PlanMainAdapter extends RecyclerView.Adapter<PlanMainAdapter.ViewHolder>{

    private String[] dummyData;
    private Context context;

    public PlanMainAdapter(Context _context, String[] _dummyData){
        context = _context;
        dummyData = _dummyData;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_plan_main, parent, false);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.btn_plan.setText(dummyData[position]);
        final int pos = position;
        Button.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = dummyData[pos];
                Intent intent = new Intent(context, ModifyPlanActivity.class);
                intent.putExtra("id", data);
                context.startActivity(intent);
            }
        };

        holder.btn_plan.setOnClickListener(listener);
    }

    @Override
    public int getItemCount() {
        return dummyData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private Button btn_plan;
        public ViewHolder(View view){
            super(view);
            btn_plan = (Button) view.findViewById(R.id.plan_main_item_btn);
        }

    }
}
