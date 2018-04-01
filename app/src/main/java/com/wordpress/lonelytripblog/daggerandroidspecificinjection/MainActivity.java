package com.wordpress.lonelytripblog.daggerandroidspecificinjection;

import android.os.Bundle;
import android.support.design.widget.Snackbar;

import com.wordpress.lonelytripblog.daggerandroidspecificinjection.dummydata.DummyObjectToInjectInActivity;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity;
import dagger.android.support.HasSupportFragmentInjector;

public class MainActivity extends DaggerAppCompatActivity implements HasSupportFragmentInjector {

    @Inject
    DummyObjectToInjectInActivity dummyObjectToInjectInActivity;

    @Inject
    DispatchingAndroidInjector<android.support.v4.app.Fragment> injectorForFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Snackbar.make(findViewById(R.id.root_layout),
                dummyObjectToInjectInActivity.getTextToShow(), Snackbar.LENGTH_INDEFINITE)
                .setAction("Got it", (view) -> {
                }).show();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new BlankFragment()).commit();
    }

    @Override
    public AndroidInjector<android.support.v4.app.Fragment> supportFragmentInjector() {
        return injectorForFragment;
    }
}
