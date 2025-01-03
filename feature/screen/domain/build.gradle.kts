plugins {
    id(libs.plugins.java.library.get().pluginId)
    id(libs.plugins.org.jetbrains.get().pluginId)
    id("kotlin-kapt")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation(libs.hilt.kapt)
}