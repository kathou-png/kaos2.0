package com.example.variables;

import android.util.DisplayMetrics;
import android.app.Application;
import android.util.DisplayMetrics;
public class variables extends Application{

    DisplayMetrics display = this.getResources().getDisplayMetrics();
    int width = display.widthPixels;
    int height = display.heightPixels;
    int origin_weight = 0;
    int origin_height = 0;

}
