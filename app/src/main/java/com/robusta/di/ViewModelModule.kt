package com.robusta.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.robusta.ui.home.ui.HomeVM

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(HomeVM::class)
    abstract fun bindConverterViewModel(viewModel: HomeVM): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}
