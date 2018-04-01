package com.wordpress.lonelytripblog.daggerandroidspecificinjection;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.wordpress.lonelytripblog.daggerandroidspecificinjection.dummydata.DummyObjectToInjectInActivity;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class MainActivity extends AppCompatActivity implements HasSupportFragmentInjector {

    private DummyObjectToInjectInActivity dummyObjectToInjectInActivity =
            new DummyObjectToInjectInActivity();

    @Inject
    DispatchingAndroidInjector<Fragment> injectorForFragment;

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
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return injectorForFragment;
    }
}
