package com.wordpress.lonelytripblog.daggerandroidspecificinjection;

import android.app.Application;

public class App extends Application {

    private static AppMainComponent appMainComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appMainComponent = DaggerAppMainComponent.builder().build();
    }

    public static AppMainComponent getAppMainComponent() {
        return appMainComponent;
    }
}
