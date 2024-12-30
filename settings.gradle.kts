pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Hostelry"
include(":app")
include(":feature:screen:domain")
include(":feature:screen:data")
include(":feature:screen:presenter")
include(":feature:detail:domain")
include(":feature:detail:presenter")
include(":feature:detail:data")
