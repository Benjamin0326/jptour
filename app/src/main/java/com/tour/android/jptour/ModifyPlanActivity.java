package com.tour.android.jptour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.azoft.carousellayoutmanager.CarouselLayoutManager;
import com.azoft.carousellayoutmanager.CarouselZoomPostLayoutListener;
import com.azoft.carousellayoutmanager.CenterScrollListener;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import com.synnapps.carouselview.CarouselView;

public class ModifyPlanActivity extends MainActivity {
    private RelativeLayout activity_modify_plan;
    private ImageView img;
    private String id;
    private TextView tv_title;
    private CarouselView carouselView;
    private int num = 5;    // test #page
    private String dummyData[] = {"1. Dummy Data\nIt's Detail Dummy Data",
            "2. Dummy Data\nIt's Detail Dummy Data",
            "3. Dummy Data\nIt's Detail Dummy Data",
            "4. Dummy Data\nIt's Detail Dummy Data",
            "5. Dummy Data\nIt's Detail Dummy Data"};
    private RecyclerView recyclerView;
    private PlanModifyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify_plan);
        activity_modify_plan = (RelativeLayout) findViewById(R.id.activity_modify_plan);
        img = new ImageView(this);
        Picasso.with(this).load(R.drawable.add).into(img, new Callback() {
            @Override
            public void onSuccess() {
                activity_modify_plan.setBackground(img.getDrawable());
            }

            @Override
            public void onError() {

            }
        });

        Intent intent = new Intent(this.getIntent());
        id = intent.getStringExtra("id");
        tv_title = (TextView) findViewById(R.id.modify_plan_tv);
        tv_title.setText(id);
        recyclerView = (RecyclerView) findViewById(R.id.plan_modify_recycler);
        adapter = new PlanModifyAdapter(this, dummyData);
        CarouselLayoutManager layoutManager = new CarouselLayoutManager(CarouselLayoutManager.VERTICAL);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(false);
        recyclerView.addOnScrollListener(new CenterScrollListener());
        layoutManager.setPostLayoutListener(new CarouselZoomPostLayoutListener());

        ItemTouchHelper.SimpleCallback simpleCallback = new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {       // 4 왼쪽 8 오른쪽
                if(direction==8){
                    Intent intent = new Intent(ModifyPlanActivity.this, PlanAddActivity.class);
                    startActivity(intent);
                }
                if(direction==4){
                    Intent intent = new Intent(ModifyPlanActivity.this, FinishActivity.class);
                    startActivity(intent);
                }
            }
        };
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simpleCallback);
        itemTouchHelper.attachToRecyclerView(recyclerView);
    }
}
