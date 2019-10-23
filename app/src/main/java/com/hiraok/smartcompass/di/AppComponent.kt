package com.hiraok.smartcompass.di

import android.app.Application
import com.hiraok.smartcompass.SmartCompassApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        ApiComponentModule::class,
        RepositoryModule::class,
        MainActivityBuilder::class,
        UseCaseModule::class
    ]
)
interface AppComponent : AndroidInjector<SmartCompassApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    override fun inject(instance: SmartCompassApplication)

}
