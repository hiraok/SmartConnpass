package com.hiraok.smartcompass.di

import com.facebook.flipper.plugins.network.FlipperOkhttpInterceptor
import com.facebook.flipper.plugins.network.NetworkFlipperPlugin
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
        fun provideOkHttp(): OkHttpClient {
            val networkFlipperPlugin = NetworkFlipperPlugin()
            return OkHttpClient().newBuilder()
                .addNetworkInterceptor(FlipperOkhttpInterceptor(networkFlipperPlugin))
                .build()
        }

        @JvmStatic
        @Singleton
        @Provides
        fun provideCompassApiRetrofit(okHttpClient: OkHttpClient): Retrofit {
            return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("https://connpass.com/")
                .addConverterFactory(MoshiConverterFactory.create(Moshi.Builder().build()))
                .build()
        }
    }
}