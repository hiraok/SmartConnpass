buildscript {
    val kotlin_version:String by extra(Versions.kotlin_version)
    repositories {
        google()
        jcenter()
        
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.4.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        
    }
}

tasks.create("clean", type = Delete::class) {}
