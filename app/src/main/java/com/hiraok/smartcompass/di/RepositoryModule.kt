package com.hiraok.smartcompass.di

import com.hiraok.smartcompass.CompassApi
import com.hiraok.smartcompass.data.repository.EventRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
internal object RepositoryModule {

    @Singleton
    @Provides
    @JvmStatic
    fun provideEventRepository(compassApi: CompassApi) = EventRepository(compassApi)

}