package com.tour.android.jptour;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class PlanAddDetailActivity extends MainActivity {

    ImageView plan_add_detail_img1, plan_add_detail_img2, plan_add_detail_img3, plan_add_detail_img4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_add_detail);

        plan_add_detail_img1 = (ImageView) findViewById(R.id.plan_add_detail_img1);
        plan_add_detail_img2 = (ImageView) findViewById(R.id.plan_add_detail_img2);
        plan_add_detail_img3 = (ImageView) findViewById(R.id.plan_add_detail_img3);
        plan_add_detail_img4 = (ImageView) findViewById(R.id.plan_add_detail_img4);
        Picasso.with(this).load(R.drawable.plan_detail_eraser).into(plan_add_detail_img1);
        Picasso.with(this).load(R.drawable.plan_detail_pen).into(plan_add_detail_img2);
        Picasso.with(this).load(R.drawable.plan_detail_pencil).into(plan_add_detail_img3);
        Picasso.with(this).load(R.drawable.temp).into(plan_add_detail_img4);

    }
}
