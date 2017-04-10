package com.tour.android.jptour;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class PlanMainActivity extends MainActivity{

    private PlanMainAdapter adapter;
    private RecyclerView recyclerView;
    private String[] dummyData = {"PLAN A", "PLAN B", "PLAN C", "ADD PLAN"};

    private ImageView img, plan_main_img1, plan_main_img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_main);
        img = new ImageView(this);
        plan_main_img1 = (ImageView) findViewById(R.id.plan_main_img1);
        plan_main_img2 = (ImageView) findViewById(R.id.plan_main_img2);
        recyclerView = (RecyclerView) findViewById(R.id.plan_main_recycler);
        Picasso.with(this).load(R.drawable.plan_main_top).into(plan_main_img1);
        Picasso.with(this).load(R.drawable.plan_main_bottom).into(plan_main_img2);
        Picasso.with(this).load(R.drawable.plan_main).into(img, new Callback() {
            @Override
            public void onSuccess() {
                recyclerView.setBackground(img.getDrawable());
            }

            @Override
            public void onError() {

            }
        });
        adapter = new PlanMainAdapter(this, dummyData);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

    }
}
