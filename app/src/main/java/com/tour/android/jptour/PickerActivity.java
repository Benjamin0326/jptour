package com.tour.android.jptour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.NumberPicker;

public class PickerActivity extends AppCompatActivity {

    private NumberPicker night, day, city;
    private String[] nights, days, cities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picker);

        nights = new String[10];
        days = new String[10];
        cities = new String[10];

        for(int i=0;i<nights.length;i++){
            nights[i] = (i+1)+"박";
            days[i] = (i+2)+"일";
            cities[i] = (i+1)+"번째 도시";
        }

        Log.i("StringTest", nights[0]+" "+days[0]+" "+cities[0]);

        night = (NumberPicker) findViewById(R.id.picker_night);
        night.setMinValue(0);
        night.setMaxValue(nights.length-1);
        night.setDisplayedValues(nights);
        night.setWrapSelectorWheel(false);
        night.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int i, int i1) {
                day.setValue(i1);
            }
        });

        day = (NumberPicker) findViewById(R.id.picker_day);
        day.setMinValue(0);
        day.setMaxValue(days.length-1);
        day.setDisplayedValues(days);
        day.setWrapSelectorWheel(false);
        day.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int i, int i1) {
                night.setValue(i1);
            }
        });

        city = (NumberPicker) findViewById(R.id.picker_city);
        city.setMinValue(0);
        city.setMaxValue(cities.length-1);
        city.setDisplayedValues(cities);

    }
}