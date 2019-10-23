package com.hiraok.smartcompass.di

import com.hiraok.smartcompass.EventAllUseCase
import com.hiraok.smartcompass.data.repository.EventRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
internal object UseCaseModule {

    @Singleton
    @Provides
    @JvmStatic
    fun provideEventAllUseCase(eventRepository: EventRepository): EventAllUseCase =
        EventAllUseCase(eventRepository)

}