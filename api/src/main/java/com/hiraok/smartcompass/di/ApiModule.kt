package com.hiraok.smartcompass.di

import com.hiraok.smartcompass.CompassApi
import com.hiraok.smartcompass.CompassApiImpl
import com.squareup.moshi.Moshi
import dagger.Binds
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module(includes = [ApiModule.Providers::class])
internal abstract class ApiModule {

    @Binds
    abstract fun compassApi(compassApi: CompassApiImpl): CompassApi

    @Module
    internal object Providers {
        @JvmStatic
        @Singleton
        @Provides
        fun provideOkHttp(): OkHttpClient =
            OkHttpClient().newBuilder()
                .build()

        @JvmStatic
        @Singleton
        @Provides
        fun provideCompassApiRetrofit(okHttpClient: OkHttpClient): Retrofit {
            return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("https://connpass.com/api/v1")
                .addConverterFactory(MoshiConverterFactory.create(Moshi.Builder().build()))
                .build()
        }
    }
}