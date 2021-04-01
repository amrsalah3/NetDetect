package com.narify.netdetectsample;

import android.app.Application;

import com.narify.netdetect.NetDetect;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        NetDetect.init(this);
    }
}
