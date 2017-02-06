package com.tour.android.jptour;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class PlanMainActivity extends MainActivity{

    private PlanMainAdapter adapter;
    private RecyclerView recyclerView;
    private String[] dummyData = {"PLAN A", "PLAN B", "PLAN C", "ADD PLAN"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_main);

        recyclerView = (RecyclerView) findViewById(R.id.plan_main_recycler);
        adapter = new PlanMainAdapter(this, dummyData);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

    }
}
