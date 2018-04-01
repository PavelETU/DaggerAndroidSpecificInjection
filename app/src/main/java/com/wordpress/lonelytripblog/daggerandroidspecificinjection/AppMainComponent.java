package com.wordpress.lonelytripblog.daggerandroidspecificinjection;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ModuleForObjectProviders.class)
public interface AppMainComponent {

    void inject(MainActivity mainActivity);
    void inject(BlankFragment blankFragment);

}
