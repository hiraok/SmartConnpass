package com.hiraok.smartcompass.di

import android.content.Context
import com.hiraok.smartcompass.CompassApi
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ApiModule::class
    ]
)
interface ApiComponent {

    fun compassApi(): CompassApi

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun context(context: Context) : Builder
        fun build(): ApiComponent
    }

    companion object {
        fun builder(): Builder = DaggerApiComponent.builder()
    }

}