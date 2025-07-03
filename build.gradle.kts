gradle.taskGraph.whenReady {
    allprojects {
        tasks.configureEach {
            if (name.contains("testDebugUnitTest") || name.contains("testReleaseUnitTest")) {
                enabled = false
                println("❌ Disabled task: $path")
            }
        }
    }
}

plugins {
    alias(libs.plugins.multiplatform).apply(false)
    alias(libs.plugins.compose.compiler).apply(false)
    alias(libs.plugins.compose).apply(false)
    alias(libs.plugins.android.application).apply(false)
    alias(libs.plugins.android.library).apply(false)
    alias(libs.plugins.hotReload).apply(false)
    alias(libs.plugins.kotlinx.serialization).apply(false)
}
