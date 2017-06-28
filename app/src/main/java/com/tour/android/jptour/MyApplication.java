package com.tour.android.jptour;

import android.app.Application;

import com.tsengvn.typekit.Typekit;

/**
 * Created by Seo on 2017-02-06.
 */

public class MyApplication extends Application {
    public void onCreate() {
        super.onCreate();

        Typekit.getInstance().addNormal(Typekit.createFromAsset(this, "NotoSans-Regular.ttf"));
        Typekit.getInstance().addBold(Typekit.createFromAsset(this, "Porter-Bold.ttf"));

    }
}
