package com.hiraok.smartconnpass.di

import android.app.Application
import com.hiraok.smartconnpass.CompassApi
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
