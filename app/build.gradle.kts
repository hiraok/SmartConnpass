plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-android-extensions")
    id("androidx.navigation.safeargs.kotlin")
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

    dataBinding {
        isEnabled = true
    }
}

dependencies {
    implementation(project(":api"))
    implementation(project(":model"))
    implementation(Depends.kotlin.stdlib)
    implementation(Depends.kotlin.coroutines)
    implementation(Depends.kotlin.coroutineAndroid)
    implementation(Depends.Support.appcompat)
    implementation(Depends.ktx)
    implementation(Depends.ktx_viewModel)
    implementation(Depends.ktx_reactiveStream)
    implementation(Depends.ktx_fragment)
    implementation(Depends.ktx_navigation)
    implementation(Depends.ktx_ui)
    implementation(Depends.Layout.constraint)
    implementation(Depends.Dagger.dagger)
    kapt(Depends.Dagger.daggerAnnotation)
    kapt(Depends.Dagger.androidSupport)
    implementation(Depends.Dagger.daggerAndroid)
    kapt(Depends.Dagger.daggerAndroidAnnotation)
    implementation(Depends.Groupie.core)
    implementation(Depends.Groupie.binding)
    testImplementation(Depends.Test.junit)
    androidTestImplementation(Depends.Test.runner)
    androidTestImplementation(Depends.Test.espresso)
}
