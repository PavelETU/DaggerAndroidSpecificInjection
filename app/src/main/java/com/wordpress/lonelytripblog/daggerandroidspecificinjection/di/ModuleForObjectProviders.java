package com.wordpress.lonelytripblog.daggerandroidspecificinjection.di;

import com.wordpress.lonelytripblog.daggerandroidspecificinjection.dummydata.DummyObjectToInjectInActivity;
import com.wordpress.lonelytripblog.daggerandroidspecificinjection.dummydata.DummyObjectToInjectInFragment;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ModuleForObjectProviders {

    @Provides
    @Singleton
    public DummyObjectToInjectInActivity dummyObjectToInjectInActivity() {
        return new DummyObjectToInjectInActivity();
    }

    @Provides
    @Singleton
    public DummyObjectToInjectInFragment dummyObjectToInjectInFragment() {
        return new DummyObjectToInjectInFragment();
    }

}
