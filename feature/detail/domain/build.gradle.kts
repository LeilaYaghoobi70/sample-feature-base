plugins {
    id(libs.plugins.java.library.get().pluginId)
    id(libs.plugins.org.jetbrains.get().pluginId)
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}