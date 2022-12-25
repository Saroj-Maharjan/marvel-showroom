plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

repositories {
    google()
    jcenter()
    mavenCentral()
    maven("https://oss.sonatype.org/content/repositories/snapshots")
    maven("https://plugins.gradle.org/m2/")
    maven("https://ci.android.com/builds/submitted/5837096/androidx_snapshot/latest/repository")
}

object Dependencies {
    object Versions {
        const val androidGradlePlugin = "7.3.1"
        const val kotlinGradlePlugin = "1.6.10"

        const val detektGradlePlugin = "1.16.0"
        const val gradleVersion = "0.33.0"
        const val navigationVersion = "2.3.0"
        const val jacocoVersion = "0.16.0"
        const val dokkaVersion = "0.10.0"
        const val ktlintVersion = "0.39.0"
        const val spotlessVersion = "5.6.1"
        const val graphGeneratorVersion = "0.6.0"
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinGradlePlugin}"
    const val detektGradlePlugin = "io.gitlab.arturbosch.detekt:detekt-gradle-plugin:${Versions.detektGradlePlugin}"
    const val gradleVersionPlugin = "com.github.ben-manes:gradle-versions-plugin:${Versions.gradleVersion}"
    const val navigationSafeArgsPlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigationVersion}"
    const val jacocoPlugin = "com.vanniktech:gradle-android-junit-jacoco-plugin:${Versions.jacocoVersion}"
    const val dokkaPlugin = "org.jetbrains.dokka:dokka-gradle-plugin:${Versions.dokkaVersion}"
    const val ktlintPlugin = "com.pinterest:ktlint:${Versions.ktlintVersion}"
    const val spotlessPlugin = "com.diffplug.spotless:spotless-plugin-gradle:${Versions.spotlessVersion}"
    const val graphGeneratorPlugin = "com.vanniktech:gradle-dependency-graph-generator-plugin:${Versions.graphGeneratorVersion}"
}

dependencies {
    implementation(Dependencies.androidGradlePlugin)
    implementation(Dependencies.kotlinGradlePlugin)
    implementation(Dependencies.detektGradlePlugin)
    implementation(Dependencies.gradleVersionPlugin)
    implementation(Dependencies.navigationSafeArgsPlugin)
    implementation(Dependencies.jacocoPlugin)
    implementation(Dependencies.dokkaPlugin)
    implementation(Dependencies.ktlintPlugin)
    implementation(Dependencies.spotlessPlugin)
    implementation(Dependencies.graphGeneratorPlugin)
}