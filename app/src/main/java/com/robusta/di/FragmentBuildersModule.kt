package com.robusta.di

import com.robusta.ui.home.ui.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeConverterFragment(): HomeFragment
}