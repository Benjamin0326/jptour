package com.tour.android.jptour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class FinishActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FinishAdapter finishAdapter;
    private int len = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        recyclerView = (RecyclerView) findViewById(R.id.finish_recycler);
        finishAdapter = new FinishAdapter(this, len);
        LinearLayoutManager verticalLayoutManager = new LinearLayoutManager(this);
        verticalLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setAdapter(finishAdapter);
        recyclerView.setLayoutManager(verticalLayoutManager);
    }
}
