package com.wordpress.lonelytripblog.daggerandroidspecificinjection;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    DummyObjectToInjectInActivity dummyObjectToInjectInActivity = new DummyObjectToInjectInActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        App.getAppMainComponent().inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Snackbar.make(findViewById(R.id.root_layout),
                dummyObjectToInjectInActivity.getTextToShow(), Snackbar.LENGTH_INDEFINITE)
                .setAction("Got it", (view) -> {}).show();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new BlankFragment()).commit();
    }
}
