package com.tour.android.jptour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity{

    private Intent splashIntent;
    ImageButton plan_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plan_btn = (ImageButton) findViewById(R.id.main_plan_btn);
        plan_btn.setOnClickListener(listener);
        splashIntent = new Intent(this, SplashActivity.class);
        startActivity(splashIntent);
    }

    ImageButton.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int id = view.getId();
            if(id==R.id.main_plan_btn){
                Intent intent = new Intent(MainActivity.this, PlanMainActivity.class);
                startActivity(intent);
            }
        }
    };

}
