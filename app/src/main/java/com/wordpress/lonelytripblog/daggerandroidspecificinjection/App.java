package com.wordpress.lonelytripblog.daggerandroidspecificinjection;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks;

import com.wordpress.lonelytripblog.daggerandroidspecificinjection.di.AppMainComponent;
import com.wordpress.lonelytripblog.daggerandroidspecificinjection.di.DaggerAppMainComponent;

import dagger.android.support.AndroidSupportInjection;

public class App extends Application {

    private AppMainComponent mainComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                if (activity instanceof MainActivity) {
                    if (mainComponent == null) {
                        mainComponent = DaggerAppMainComponent.create();
                    }
                    mainComponent.inject((MainActivity) activity);
                }
                ((FragmentActivity) activity).getSupportFragmentManager()
                        .registerFragmentLifecycleCallbacks(new FragmentLifecycleCallbacks() {
                            @Override
                            public void onFragmentPreAttached(FragmentManager fm, Fragment f, Context context) {
                                AndroidSupportInjection.inject(f);
                            }
                        }, true);
            }

            @Override
            public void onActivityStarted(Activity activity) {

            }

            @Override
            public void onActivityResumed(Activity activity) {

            }

            @Override
            public void onActivityPaused(Activity activity) {

            }

            @Override
            public void onActivityStopped(Activity activity) {

            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

            }

            @Override
            public void onActivityDestroyed(Activity activity) {

            }
        });
    }

}
