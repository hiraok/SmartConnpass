import Versions.minSdkVersion

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(Versions.androidCompileSdkVersion)
    defaultConfig {
        minSdkVersion(Versions.minSdkVersion)
    }
}

dependencies {
    implementation(project(":model"))
    implementation(Depends.ktxCore)
    implementation(Depends.Kotlin.coroutines)
    implementation(Depends.Kotlin.coroutinesAndroid)
    implementation(Depends.Kotlin.stdlib)
    implementation(Depends.OkHttp.okHttp)
    implementation(Depends.Retrofit.retrofit)
    implementation(Depends.Moshi.moshi)
    implementation(Depends.Retrofit.converterMoshi)
    implementation(Depends.Retrofit.adapterRxJava2)
    implementation(Depends.Dagger.dagger)
    kapt(Depends.Dagger.daggerCompiler)
    debugImplementation(Depends.Flipper.network)
}
