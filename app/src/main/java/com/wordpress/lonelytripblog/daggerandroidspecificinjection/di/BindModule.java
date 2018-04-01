package com.wordpress.lonelytripblog.daggerandroidspecificinjection.di;


import android.app.Activity;
import android.app.Fragment;

import com.wordpress.lonelytripblog.daggerandroidspecificinjection.BlankFragment;
import com.wordpress.lonelytripblog.daggerandroidspecificinjection.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.android.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {AppMainActivitySubcomponent.class, AppMainFragmentSubcomponent.class})
public abstract class BindModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
                                bindActivityInjectorFactory(AppMainActivitySubcomponent.Builder builder);

    @Binds
    @IntoMap
    @FragmentKey(BlankFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment>
                        bindFragmentInjectorFactory(AppMainFragmentSubcomponent.Builder builder);

}
