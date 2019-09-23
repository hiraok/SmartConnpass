package com.hiraok.smartcompass.di

import android.app.Application
import com.hiraok.smartcompass.SmartCompassApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        ApiComponentModule::class
    ]
)
interface AppComponent : AndroidInjector<SmartCompassApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    override fun inject(instance: SmartCompassApplication?)

}
