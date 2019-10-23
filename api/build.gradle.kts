plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(Versions.compileSdkVersion)
    defaultConfig {
        minSdkVersion(Versions.minSdkVersion)
    }
}

dependencies {
    implementation(project(":model"))
    implementation(Depends.ktx)
    implementation(Depends.kotlin.stdlib)
    implementation(Depends.Okhttp.okhttp)
    implementation(Depends.Retrofit.retrofit)
    implementation(Depends.Moshi.moshi)
    implementation(Depends.Retrofit.converterMoshi)
    implementation(Depends.Retrofit.adapterRxJava2)
    implementation(Depends.Dagger.dagger)
    kapt(Depends.Dagger.daggerCompiler)
    debugImplementation(Depends.Flipper.network)
}
