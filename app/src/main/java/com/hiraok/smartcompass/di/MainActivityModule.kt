package com.hiraok.smartcompass.di

import androidx.lifecycle.ViewModel
import com.hiraok.smartcompass.ui.EventListFragment
import com.hiraok.smartcompass.EventListViewModel
import com.hiraok.smartcompass.ui.MyPageFragment
import com.hiraok.smartcompass.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
interface MainActivityModule {

    @ContributesAndroidInjector
    fun contributeEventListFragment(): EventListFragment

    @ContributesAndroidInjector
    fun contributeMyPageFragment(): MyPageFragment

    @Binds
    @IntoMap
    @ViewModelKey(EventListViewModel::class)
    fun bindEventListViewModel(
        eventListViewModel: EventListViewModel
    ): ViewModel
}