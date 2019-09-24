package com.hiraok.smartcompass.di

import com.hiraok.smartcompass.CompassApi
import com.hiraok.smartcompass.data.repository.EventRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideEventRepository(compassApi: CompassApi) = EventRepository(compassApi)

}