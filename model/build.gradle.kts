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
    api(Depends.ktxCore)
    api(Depends.Kotlin.stdlib)
}
