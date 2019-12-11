package com.hiraok.smartconnpass.di

import com.hiraok.smartconnpass.GetAllEventUseCase
import com.hiraok.smartconnpass.data.repository.EventRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
internal object UseCaseModule {

    @Singleton
    @Provides
    @JvmStatic
    fun provideEventAllUseCase(eventRepository: EventRepository): GetAllEventUseCase =
        GetAllEventUseCase(eventRepository)

}