package com.tour.android.jptour;

import android.content.Context;
import android.content.Intent;
import android.drm.DrmStore;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by sung9 on 2017-02-03.
 */

public class FinishAdapter extends RecyclerView.Adapter<FinishAdapter.ViewHolder>{


    private Context context;
    private int len;

    public FinishAdapter(Context _context, int _len){
        context = _context;
        len = _len;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_final, parent, false);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    public int getPixelSize(double input){
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (input * scale + 0.5f);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if(position == 0){
            holder.up.setVisibility(View.GONE);
        }
        if(position==len-1){
            holder.down1.setVisibility(View.GONE);
            holder.down2.setVisibility(View.GONE);
        }
        if(position%2==0){
            LinearLayout.LayoutParams lp1 = new LinearLayout.LayoutParams(getPixelSize(1.5), getPixelSize(50));
            lp1.gravity= Gravity.LEFT;
            holder.up.setLayoutParams(lp1);
            ViewGroup.MarginLayoutParams p1 = (ViewGroup.MarginLayoutParams) holder.up.getLayoutParams();
            p1.setMargins(getPixelSize(65), 0, 0, 0);
            holder.up.requestLayout();

            LinearLayout.LayoutParams lp2 = new LinearLayout.LayoutParams(getPixelSize(1.5), getPixelSize(50));
            lp2.gravity= Gravity.LEFT;
            holder.down1.setLayoutParams(lp2);
            ViewGroup.MarginLayoutParams p2 = (ViewGroup.MarginLayoutParams) holder.down1.getLayoutParams();
            p2.setMargins(getPixelSize(65), 0, 0, 0);
            holder.down1.requestLayout();

            LinearLayout.LayoutParams lp3 = new LinearLayout.LayoutParams(getPixelSize(100), getPixelSize(100));
            lp3.gravity= Gravity.LEFT;
            holder.iv.setLayoutParams(lp3);
            ViewGroup.MarginLayoutParams p3 = (ViewGroup.MarginLayoutParams) holder.iv.getLayoutParams();
            p3.setMargins(getPixelSize(15), 0, 0, 0);
            holder.iv.requestLayout();
        } else{
            LinearLayout.LayoutParams lp1 = new LinearLayout.LayoutParams(getPixelSize(1.5), getPixelSize(50));
            lp1.gravity= Gravity.RIGHT;
            holder.up.setLayoutParams(lp1);
            ViewGroup.MarginLayoutParams p1 = (ViewGroup.MarginLayoutParams) holder.up.getLayoutParams();
            p1.setMargins(0, 0, getPixelSize(65), 0);
            holder.up.requestLayout();

            LinearLayout.LayoutParams lp2 = new LinearLayout.LayoutParams(getPixelSize(1.5), getPixelSize(50));
            lp2.gravity= Gravity.RIGHT;
            holder.down1.setLayoutParams(lp2);
            ViewGroup.MarginLayoutParams p2 = (ViewGroup.MarginLayoutParams) holder.down1.getLayoutParams();
            p2.setMargins(0, 0, getPixelSize(65), 0);
            holder.down1.requestLayout();

            LinearLayout.LayoutParams lp3 = new LinearLayout.LayoutParams(getPixelSize(100), getPixelSize(100));
            lp3.gravity= Gravity.RIGHT;
            holder.iv.setLayoutParams(lp3);
            ViewGroup.MarginLayoutParams p3 = (ViewGroup.MarginLayoutParams) holder.iv.getLayoutParams();
            p3.setMargins(0, 0, getPixelSize(15), 0);
            holder.iv.requestLayout();
        }

    }

    @Override
    public int getItemCount() {
        return len;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView iv;
        private View up, down1, down2;

        public ViewHolder(View view) {
            super(view);
            iv = (ImageView) view.findViewById(R.id.final_item_iv);
            up = (View) view.findViewById(R.id.final_item_top);
            down1 = (View) view.findViewById(R.id.final_item_bottom_1);
            down2 = (View) view.findViewById(R.id.final_item_bottom_2);
        }
    }
}
