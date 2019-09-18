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
    }

    object Moshi {
        val moshi = "com.squareup.moshi:moshi-kotlin:${Versions.moshi}"
    }

}