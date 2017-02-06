package com.tour.android.jptour;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.tsengvn.typekit.TypekitContextWrapper;

public class MainActivity extends AppCompatActivity{

    private Intent splashIntent;
    Button plan_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plan_btn = (Button) findViewById(R.id.main_plan_btn);
        plan_btn.setOnClickListener(listener);
        splashIntent = new Intent(this, SplashActivity.class);
        //startActivity(splashIntent);
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

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(TypekitContextWrapper.wrap(newBase));
    }
}
