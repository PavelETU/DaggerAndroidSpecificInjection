package com.wordpress.lonelytripblog.daggerandroidspecificinjection.di;

import com.wordpress.lonelytripblog.daggerandroidspecificinjection.BlankFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent
public interface AppMainFragmentSubcomponent extends AndroidInjector<BlankFragment> {

    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<BlankFragment> {    }

}
