package com.tour.android.jptour;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

public class PlanAddActivity extends MainActivity {

    private RecyclerView bottomRecyclerView;
    private int len=7;  //recyclerVIew length
    private Button leftArrowBtn;
    private Button contentImg;
    private Button rightArrowBtn;
    private int position = 0;
    private PlanAddBottomAdapter bottomAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_add);



        bottomRecyclerView = (RecyclerView) findViewById(R.id.plan_add_bottom_recyclerview);
        bottomAdapter = new PlanAddBottomAdapter(this, len);
        LinearLayoutManager verticalLayoutManager = new LinearLayoutManager(this);
        verticalLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        bottomRecyclerView.setAdapter(bottomAdapter);
        bottomRecyclerView.setLayoutManager(verticalLayoutManager);
    }

}
