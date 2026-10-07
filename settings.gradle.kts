pluginManagement {
    repositories {
        gradlePluginPortal()
        maven {
            name = "NeoForged"
            url = uri("https://maven.neoforged.net/releases")
        }
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "launchpad"

dependencyResolutionManagement {
    repositories {
        // TEMPORARY: lokaler 26.2-Maven-Mirror (vor PR wieder entfernen!)
        maven { url = uri("https://thisismartin321.github.io/sinytra-26.2-maven/") }
    }
}
