package com.tour.android.jptour;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.azoft.carousellayoutmanager.CarouselLayoutManager;
import com.azoft.carousellayoutmanager.CarouselZoomPostLayoutListener;
import com.azoft.carousellayoutmanager.CenterScrollListener;

public class PlanAddActivity extends MainActivity {

    private RecyclerView topRecyclerView;
    private RecyclerView bottomRecyclerView;
    private int num=10; //number of carousel item
    private int len=7;  //recyclerVIew length
    private PlanAddBottomAdapter bottomAdapter;
    private PlanAddTopAdapter topAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_add);

        topRecyclerView = (RecyclerView) findViewById(R.id.plan_add_top_recyclerview);
        topAdapter = new PlanAddTopAdapter(this, num);
        topRecyclerView.setAdapter(topAdapter);
        CarouselLayoutManager topLayoutManager = new CarouselLayoutManager(CarouselLayoutManager.HORIZONTAL);
        topRecyclerView.setAdapter(topAdapter);
        topRecyclerView.setLayoutManager(topLayoutManager);
        topRecyclerView.setHasFixedSize(false);
        topRecyclerView.addOnScrollListener(new CenterScrollListener());
        topLayoutManager.setPostLayoutListener(new CarouselZoomPostLayoutListener());


        bottomRecyclerView = (RecyclerView) findViewById(R.id.plan_add_bottom_recyclerview);
        bottomAdapter = new PlanAddBottomAdapter(this, len);
        LinearLayoutManager verticalLayoutManager = new LinearLayoutManager(this);
        verticalLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        bottomRecyclerView.setAdapter(bottomAdapter);
        bottomRecyclerView.setLayoutManager(verticalLayoutManager);
    }

}
