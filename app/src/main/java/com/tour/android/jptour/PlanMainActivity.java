package com.tour.android.jptour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class PlanMainActivity extends AppCompatActivity{

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
