package com.wordpress.lonelytripblog.daggerandroidspecificinjection.di;

import com.wordpress.lonelytripblog.daggerandroidspecificinjection.MainActivity;

import javax.inject.Singleton;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Singleton
@Subcomponent(modules = ModuleForObjectProviders.class)
public interface AppMainActivitySubcomponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<MainActivity> {}

}
