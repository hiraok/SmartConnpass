package com.hiraok.smartconnpass.di

import androidx.lifecycle.ViewModel
import com.hiraok.smartconnpass.ui.EventListFragment
import com.hiraok.smartconnpass.EventListViewModel
import com.hiraok.smartconnpass.ui.MyPageFragment
import com.hiraok.smartconnpass.ViewModelKey
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