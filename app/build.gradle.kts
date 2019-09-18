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
    implementation(Depends.kotlin.stdlib)
    implementation(Depends.Support.appcompat)
    implementation(Depends.ktx)
    implementation(Depends.Layout.constraint)
    testImplementation(Depends.Test.junit)
    androidTestImplementation(Depends.Test.runner)
    androidTestImplementation(Depends.Test.espresso)
}
