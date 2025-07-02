import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSetTree

plugins {
    alias(libs.plugins.multiplatform)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.compose)
    alias(libs.plugins.android.application)
    alias(libs.plugins.hotReload)
    alias(libs.plugins.kotlinx.serialization)
}

kotlin {
    androidTarget {
        instrumentedTestVariant.sourceSetTree.set(KotlinSourceSetTree.test)
    }

    sourceSets {
        androidMain.dependencies {
            implementation(compose.uiTooling)
            implementation(libs.androidx.activityCompose)
            implementation(libs.kotlinx.coroutines.android)
            implementation(libs.ktor.client.okhttp)
            implementation(project(":presentation:root"))
        }
    }
}

android {
    namespace = "com.yshmgrt.voxmachinae"
    compileSdk = 36

    defaultConfig {
        minSdk = 21
        targetSdk = 36

        applicationId = "com.yshmgrt.voxmachinae.androidApp"
        versionCode = 1
        versionName = "1.0.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

// https://developer.android.com/develop/ui/compose/testing#setup
dependencies {
    androidTestImplementation(libs.androidx.uitest.junit4)
    debugImplementation(libs.androidx.uitest.testManifest)
}
