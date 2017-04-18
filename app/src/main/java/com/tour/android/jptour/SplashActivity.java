package com.tour.android.jptour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread timer=new Thread()
        {
            public void run() {
                try{
                    sleep(2000);
                } catch ( Exception e){
                    e.printStackTrace();
                }
            }
        };
        timer.start();
        try{
            timer.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        finish();
    }
}
