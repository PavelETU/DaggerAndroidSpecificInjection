package com.wordpress.lonelytripblog.daggerandroidspecificinjection.di;

import com.wordpress.lonelytripblog.daggerandroidspecificinjection.App;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {AndroidInjectionModule.class,
        BindModule.class})
public interface AppMainComponent {

    void inject(App app);

}
