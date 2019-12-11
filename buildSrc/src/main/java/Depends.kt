object Depends {
    object Kotlin {
        val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlinVersion}"
        val coroutines =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
        val coroutinesAndroid =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    }

    object Support {
        val appcompat = "androidx.appcompat:appcompat:${Versions.appCompat}"

    }

    val ktxCore = "androidx.core:core-ktx:${Versions.ktxCore}"
    val ktxCollection = "androidx.collection:collection-ktx:${Versions.ktxCollection}"
    val ktxViewModel =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.ktxLifeCycle}"
    val ktxReactiveStream =
        "androidx.lifecycle:lifecycle-reactivestreams-ktx:${Versions.ktxLifeCycle}"
    val ktxLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.ktxLifeCycle}"
    val ktxRunTime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.ktxLifeCycle}"
    val ktxFragment = "androidx.fragment:fragment-ktx:${Versions.ktxFragment}"
    val ktxPaging = "androidx.paging:paging-runtime-ktx:${Versions.paging}"
    val ktxNavigation = "androidx.navigation:navigation-fragment-ktx:${Versions.navVersion}"
    val ktxUi = "androidx.navigation:navigation-ui-ktx:${Versions.navVersion}"
    val ktxPalette = "androidx.palette:palette-ktx:${Versions.ktxPalette}"
    val ktxWorkManager = "androidx.work:work-runtime-ktx:${Versions.ktxWorkManager}"

    object Layout {
        val constraint =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    }

    object Test {
        val junit = "junit:junit:${Versions.junit}"
        val runner = "androidx.test:runner:${Versions.testRunner}"
        val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    }

    object OkHttp {
        val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"

    }

    object Retrofit {
        val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        val converterMoshi = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
        val adapterRxJava2 = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    }

    object Moshi {
        val moshi = "com.squareup.moshi:moshi-kotlin:${Versions.moshi}"
    }

    object Dagger {
        val dagger = "com.google.dagger:dagger:${Versions.dagger}"
        val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
        val daggerAndroid = "com.google.dagger:dagger-android:${Versions.dagger}"
        val daggerAndroidSupport =
            "com.google.dagger:dagger-android-support:${Versions.dagger}"
        val daggerAndroidProcessor =
            "com.google.dagger:dagger-android-processor:${Versions.dagger}"
    }

    object Groupie {
        val core = "com.xwray:groupie:${Versions.groupie}"
        val binding = "com.xwray:groupie-databinding:${Versions.groupie}"
        val ktx = "com.xwray:groupie-kotlin-android-extensions:${Versions.groupie}"
    }

    object Flipper {
        val core = "com.facebook.flipper:flipper:${Versions.flipper}"
        val soloader = "com.facebook.soloader:soloader:${Versions.soloader}"
        val noop = "com.facebook.flipper:flipper-noop:${Versions.flipper}"
        val network = "com.facebook.flipper:flipper-network-plugin:${Versions.flipper}"
    }

    object Misc {
        val jsoup = "org.jsoup:jsoup:${Versions.jsoup}"
    }

}