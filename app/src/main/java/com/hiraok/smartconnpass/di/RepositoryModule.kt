package com.hiraok.smartconnpass.di

import com.hiraok.smartconnpass.CompassApi
import com.hiraok.smartconnpass.data.repository.EventRepository
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