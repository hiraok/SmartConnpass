package com.hiraok.smartcompass.di

import android.app.Application
import com.hiraok.smartcompass.CompassApi
import com.hiraok.smartcompass.SmartCompassApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
internal object ApiComponentModule {

    @Singleton
    @Provides
    @JvmStatic
    fun provideCompassApi(application: Application): CompassApi {
        return ApiComponent.builder().context(application)
            .build().compassApi()
    }
}
