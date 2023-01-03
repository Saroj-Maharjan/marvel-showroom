package dependencies

import com.android.build.gradle.internal.testing.utp.UtpDependency

/**
 * Include all dependencies used in the project.
 */
object Dependencies {
    const val core = "androidx.core:core-ktx:${Versions.CORE}"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE}"
    const val activityX = "androidx.activity:activity-compose:${Versions.ACTIVITY}"
    const val composeUI = "androidx.compose.ui:ui:${Versions.COMPOSE_COMPILER}"
    const val composeUITooling = "androidx.compose.ui:ui-tooling-preview:${Versions.COMPOSE_COMPILER}"
    const val composeMaterial = "androidx.compose.material3:material3:${Versions.MATERIAL3}"
}