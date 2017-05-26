package com.tour.android.jptour;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.nightonke.boommenu.BoomButtons.SimpleCircleButton;
import com.nightonke.boommenu.BoomMenuButton;
import com.tsengvn.typekit.TypekitContextWrapper;

public class MainActivity extends AppCompatActivity{

    private Intent splashIntent;
    Button plan_btn, share_btn;
    BoomMenuButton bmb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        plan_btn = (Button) findViewById(R.id.main_plan_btn);
        plan_btn.setOnClickListener(listener);
        share_btn = (Button) findViewById(R.id.main_share_btn);
        share_btn.setOnClickListener(listener);
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
            if(id==R.id.main_share_btn){
                Intent intent = new Intent(MainActivity.this, PickerActivity.class);
                startActivity(intent);
            }
            //Toast.makeText(MainActivity.this,"test",Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(TypekitContextWrapper.wrap(newBase));
    }
    public int getPixelSize(double input){
        final float scale = this.getResources().getDisplayMetrics().density;
        return (int) (input * scale + 0.5f);
    }
}