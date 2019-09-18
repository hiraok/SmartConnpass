plugins {
    `kotlin-dsl`
    id("java-library")
}

repositories {
    jcenter()
}

dependencies {
    implementation(project(":model"))
    implementation(Depends.Okhttp.okhttp)
    implementation(Depends.Retrofit.retrofit)
    implementation(Depends.Moshi.moshi)
}
