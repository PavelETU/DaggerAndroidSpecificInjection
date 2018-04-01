package com.wordpress.lonelytripblog.daggerandroidspecificinjection.di;

import com.wordpress.lonelytripblog.daggerandroidspecificinjection.App;
import com.wordpress.lonelytripblog.daggerandroidspecificinjection.MainActivity;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {AndroidInjectionModule.class,
        FragmentModule.class,
        ModuleForObjectProviders.class})
public interface AppMainComponent {

    void inject(MainActivity mainActivity);

}
