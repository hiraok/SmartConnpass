package com.hiraok.smartconnpass

import com.facebook.flipper.android.AndroidFlipperClient
import com.facebook.flipper.android.utils.FlipperUtils
import com.facebook.flipper.plugins.inspector.DescriptorMapping
import com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin
import com.facebook.soloader.SoLoader
import com.hiraok.smartconnpass.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication



class SmartCompassApplication : DaggerApplication() {

    override fun onCreate() {
        super.onCreate()
        SoLoader.init(this, false)

        if (com.hiraok.smartconnpass.BuildConfig.DEBUG && FlipperUtils.shouldEnableFlipper(this)) {
            val client = AndroidFlipperClient.getInstance(this)
            client.addPlugin(InspectorFlipperPlugin(this, DescriptorMapping.withDefaults()))
            client.start()
        }
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        DaggerAppComponent.builder().application(this).build()

}