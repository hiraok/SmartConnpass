object Depends {
    object kotlin {
        val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin_version}"
        val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
        val coroutineAndroid =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    }

    object Support {
        val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"

    }

    val ktx = "androidx.core:core-ktx:${Versions.kotlin_extension}"
    val ktx_viewModel =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.kotlin_extension_viewmodel}"
    val ktx_reactiveStream =
        "androidx.lifecycle:lifecycle-reactivestreams-ktx:${Versions.kotlin_extension_reactivestream}"
    val ktx_fragment = "androidx.fragment:fragment-ktx:${Versions.kotlin_extension_frgament}"
    val ktx_navigation = "androidx.navigation:navigation-fragment-ktx:${Versions.nav_version}"
    val ktx_ui = "androidx.navigation:navigation-ui-ktx:${Versions.nav_version}"
    val ktx_paging = "androidx.paging:paging-runtime-ktx:${Versions.paging}"

    object Layout {
        val constraint = "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout}"
    }

    object Test {
        val junit = "junit:junit:${Versions.junit}"
        val runner = "androidx.test:runner:${Versions.test_runner}"
        val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    }

    object Okhttp {
        val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"

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
        val daggerAndroidSupport = "com.google.dagger:dagger-android-support:${Versions.dagger}"
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