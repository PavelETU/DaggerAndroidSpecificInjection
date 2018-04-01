package com.wordpress.lonelytripblog.daggerandroidspecificinjection;

import android.app.Activity;
import android.app.Fragment;
import android.support.design.widget.Snackbar;
import android.os.Bundle;

import com.wordpress.lonelytripblog.daggerandroidspecificinjection.dummydata.DummyObjectToInjectInActivity;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasFragmentInjector;

public class MainActivity extends Activity implements HasFragmentInjector {

    @Inject
    DummyObjectToInjectInActivity dummyObjectToInjectInActivity;

    @Inject
    DispatchingAndroidInjector<Fragment> injectorForFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Snackbar.make(findViewById(R.id.root_layout),
                dummyObjectToInjectInActivity.getTextToShow(), Snackbar.LENGTH_INDEFINITE)
                .setAction("Got it", (view) -> {}).show();
        getFragmentManager().beginTransaction()
                .replace(R.id.container, new BlankFragment()).commit();
    }

    @Override
    public AndroidInjector<Fragment> fragmentInjector() {
        return injectorForFragment;
    }
}
