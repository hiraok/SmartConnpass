package com.hiraok.smartconnpass.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
internal object AppModule {

    @Singleton
    @Provides
    @JvmStatic
    fun provideContext(application: Application): Context = application

}