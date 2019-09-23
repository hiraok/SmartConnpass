plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(Versions.compileSdkVersion)
    defaultConfig {
        applicationId = "com.hiraok.smartcompass"
        minSdkVersion(Versions.minSdkVersion)
        targetSdkVersion(Versions.targetSdkVersion)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(project(":api"))
    implementation(project(":model"))
    implementation(Depends.kotlin.stdlib)
    implementation(Depends.Support.appcompat)
    implementation(Depends.ktx)
    implementation(Depends.Layout.constraint)
    implementation(Depends.Dagger.dagger)
    kapt(Depends.Dagger.daggerAnnotation)
    kapt(Depends.Dagger.androidSupport)
    implementation(Depends.Dagger.daggerAndroid)
    kapt(Depends.Dagger.daggerAndroidAnnotation)
    implementation(Depends.LifeCycle.extensions)
    implementation(Depends.LifeCycle.reactivestreams)
    implementation(Depends.LifeCycle.runtime)
    implementation(Depends.Groupie.core)
    implementation(Depends.Groupie.binding)
    testImplementation(Depends.Test.junit)
    androidTestImplementation(Depends.Test.runner)
    androidTestImplementation(Depends.Test.espresso)
}
