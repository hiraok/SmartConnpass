object Depends {
    object kotlin {
        val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin_version}"
    }

    object Support {
        val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"

    }

    val ktx = "androidx.core:core-ktx:${Versions.kotlin_extension}"

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
        val daggerAnnotation = "com.google.dagger:dagger-compiler:${Versions.dagger}"
        val daggerAndroid = "com.google.dagger:dagger-android:${Versions.dagger}"
        val androidSupport = "com.google.dagger:dagger-android-support:${Versions.dagger}"
        val daggerAndroidAnnotation = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
    }

    object Groupie {
        val core = "com.xwray:groupie:${Versions.groupie}"
        val binding = "com.xwray:groupie-databinding:${Versions.groupie}"
    }

    object LifeCycle {
        val runtime = "android.arch.lifecycle:runtime:${Versions.archLifecycle}"
        val extensions = "android.arch.lifecycle:extensions:${Versions.archLifecycle}"
        val reactivestreams = "android.arch.lifecycle:reactivestreams:${Versions.archLifecycle}"
    }



}