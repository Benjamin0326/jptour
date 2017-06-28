package com.tour.android.jptour;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class PlanMainActivity extends MainActivity{

    private PlanMainAdapter adapter;
    private RecyclerView recyclerView;
    private String[] dummyData = {"PLAN A", "PLAN B", "PLAN C", "ADD PLAN"};
    private LinearLayout activity_plan_main;
    private ImageView img,img1, plan_main_img1, plan_main_img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_main);
        activity_plan_main = (LinearLayout)findViewById(R.id.activity_plan_main);
        recyclerView = (RecyclerView) findViewById(R.id.plan_main_recycler);
        img = new ImageView(this);
        img1 = new ImageView(this);
        adapter = new PlanMainAdapter(this, dummyData);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

    }
}
