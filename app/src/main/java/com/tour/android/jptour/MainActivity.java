package com.tour.android.jptour;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
import com.tsengvn.typekit.TypekitContextWrapper;

public class MainActivity extends AppCompatActivity{

    private Intent splashIntent;
    Button plan_btn;
    LinearLayout activity_main;
    ImageView img, imageView4, imageView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity_main = (LinearLayout) findViewById(R.id.activity_main);
        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView3 = (ImageView) findViewById(R.id.imageView3);

        Picasso.with(this).load(R.drawable.main_pen).into(imageView4);
        Picasso.with(this).load(R.drawable.main_pencil).into(imageView3);
        img = new ImageView(this);
        //Picasso.with(this).load(R.drawable.main_test2).into(activity_main);
        Picasso.with(this).load(R.drawable.main_test2).into(img, new Callback() {
            @Override
            public void onSuccess() {
                activity_main.setBackground(img.getDrawable());
            }

            @Override
            public void onError() {

            }
        });

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

