plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    kotlin("android.extensions")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    compileSdkVersion(Versions.androidCompileSdkVersion)
    defaultConfig {
        minSdkVersion(Versions.minSdkVersion)
        applicationId = "com.hiraok.smartconnpass"
        targetSdkVersion(Versions.targetSdkVersion)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    dataBinding {
        isEnabled = true
    }
    sourceSets["main"].java.srcDir("src/main/kotlin")
}

dependencies {
    implementation(project(":api"))
    implementation(project(":model"))
    implementation(Depends.Kotlin.coroutines)
    implementation(Depends.Kotlin.stdlib)
    implementation(Depends.Kotlin.coroutinesAndroid)
    implementation(Depends.Support.appcompat)
    implementation(Depends.ktxCore)
    implementation(Depends.ktxCollection)
    implementation(Depends.ktxRunTime)
    implementation(Depends.ktxWorkManager)
    implementation(Depends.ktxPalette)
    implementation(Depends.ktxViewModel)
    implementation(Depends.ktxReactiveStream)
    implementation(Depends.ktxFragment)
    implementation(Depends.ktxNavigation)
    implementation(Depends.ktxUi)
    implementation(Depends.ktxPaging)
    implementation(Depends.ktxLiveData)
    implementation(Depends.Layout.constraint)

    implementation(Depends.Dagger.dagger)
    implementation(Depends.Dagger.daggerAndroidSupport)
    implementation(Depends.Dagger.daggerAndroid)
    kapt(Depends.Dagger.daggerAndroidProcessor)
    kapt(Depends.Dagger.daggerCompiler)

    implementation(Depends.Groupie.core)
    implementation(Depends.Groupie.binding)
    implementation(Depends.Groupie.ktx)
    implementation(Depends.Misc.jsoup)

    testImplementation(Depends.Test.junit)
    androidTestImplementation(Depends.Test.runner)
    androidTestImplementation(Depends.Test.espresso)

    debugImplementation(Depends.Flipper.core)
    debugImplementation(Depends.Flipper.soloader)
    releaseImplementation(Depends.Flipper.noop)
}
