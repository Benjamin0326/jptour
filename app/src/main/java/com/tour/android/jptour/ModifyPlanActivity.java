package com.tour.android.jptour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ModifyPlanActivity extends AppCompatActivity {

    private String id;
    private TextView tv_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify_plan);

        Intent intent = new Intent(this.getIntent());
        id = intent.getStringExtra("id");
        tv_title = (TextView)findViewById(R.id.modify_plan_tv);
        tv_title.setText(id);
    }
}
