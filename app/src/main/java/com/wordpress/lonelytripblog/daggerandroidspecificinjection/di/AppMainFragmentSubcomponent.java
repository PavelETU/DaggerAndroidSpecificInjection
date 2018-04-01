package com.wordpress.lonelytripblog.daggerandroidspecificinjection.di;

import com.wordpress.lonelytripblog.daggerandroidspecificinjection.BlankFragment;

import javax.inject.Singleton;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Singleton
@Subcomponent(modules = ModuleForObjectProviders.class)
public interface AppMainFragmentSubcomponent extends AndroidInjector<BlankFragment> {

    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<BlankFragment> {}

}
