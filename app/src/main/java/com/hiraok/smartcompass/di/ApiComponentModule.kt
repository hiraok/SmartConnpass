package com.hiraok.smartcompass.di

import com.hiraok.smartcompass.CompassApi
import com.hiraok.smartcompass.SmartCompassApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object ApiComponentModule {

    @JvmStatic
    @Singleton
    @Provides
    fun provideCompassApi(application: SmartCompassApplication): CompassApi {
        return ApiComponent.builder().context(application)
            .build().compassApi()
    }
}
