buildscript {
    repositories {
        google()
        jcenter()
        maven("https://oss.sonatype.org/content/repositories/snapshots/")
    }
    dependencies {
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navVersion}")
        classpath("com.android.tools.build:gradle:3.4.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        
    }
}

tasks.create("clean", type = Delete::class) {}
