object Depends {
    object kotlin {
        val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin_version}"
    }

    object Support {
        val appcompat = "androidx.appcompat:appcompat:1.1.0"

    }

    val ktx = "androidx.core:core-ktx:${Versions.kotlin_extension}"

    object Layout {
        val constraint = "androidx.constraintlayout:constraintlayout:1.1.3"
    }

    object Test {
        val junit = "junit:junit:${Versions.junit}"
        val runner = "androidx.test:runner:${Versions.test_runner}"
        val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    }

}