package com.example.globalvariables;

import android.app.Application;
import android.util.DisplayMetrics;

public class GlobalVariables extends Application {
    int numberofsources = 40;
    DisplayMetrics display = this.getResources().getDisplayMetrics();
    int origin_weight = 0;
    int origin_height = 0;
    int width = display.widthPixels;
    int height = display.heightPixels;

    //----------Set position of the listener in Canvas and Audio Space-----------------//
    int posXListenerCanvas;
    int posYListenerCanvas;

    int posXListenerAudio = posXListenerCanvas /100;
    int posYListenerAudio = posYListenerCanvas/100;
    public void setPosXListener (int x){
        posXListenerCanvas = x;
    }
    public void setPosYListener (int y){
        posYListenerCanvas = y;
    }
    //--------------------------------------------------------//


    //----------------------------Set position of sources in Canvas --------------------------//
    int posXSourcesCanvas[] = new int [numberofsources];
    int posYSourcesCanvas[] = new int [numberofsources];

    public void setPosXSourcesCanvas (int x, int source){ posXSourcesCanvas[source] = x; }
    public void setPosYSourcesCanvas (int y, int source) {posYSourcesCanvas[source] = y;}
    //-----------------------------------------------------------------------------//

    //---------------------Set position of sources in Audio Space --------------------------//
    int posXSourcesAudio [] = new int [numberofsources];
    int posYSourcesAudio[] = new int [numberofsources];

    public void setPosXSourcesAudio (int x, int source){ posXSourcesAudio[source] = x; }
    public void setPosYSourcesAudio (int y, int source) {posYSourcesAudio[source] = y;}
    //---------------------------------------------------------------------------------------//
}
