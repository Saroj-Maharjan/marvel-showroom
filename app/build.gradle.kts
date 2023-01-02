plugins {
    id(BuildPlugins.ANDROID_APPLICATION)
    id(BuildPlugins.KOTLIN_ANDROID)
    id(BuildPlugins.KOTLIN_KAPT)
//    id(BuildPlugins.KOTLIN_ALLOPEN)
    id(BuildPlugins.NAVIGATION_SAFE_ARGS)
    id(BuildPlugins.JACOCO)
    id(BuildPlugins.GRAPH_GENERATOR)

    id(BuildPlugins.VARIENTS)
}

android {
    namespace = BuildAndroidConfig.APPLICATION_ID
    compileSdk = BuildAndroidConfig.COMPILE_SDK_VERSION

    defaultConfig {
        applicationId =  BuildAndroidConfig.APPLICATION_ID
        minSdk = BuildAndroidConfig.MIN_SDK_VERSION
        targetSdk = BuildAndroidConfig.TARGET_SDK_VERSION
        versionCode = BuildAndroidConfig.VERSION_CODE
        versionName = BuildAndroidConfig.VERSION_NAME

        testInstrumentationRunner = BuildAndroidConfig.TEST_INSTRUMENTATION_RUNNER
        testInstrumentationRunnerArguments.putAll(BuildAndroidConfig.TEST_INSTRUMENTATION_RUNNER_ARGUMENTS)
        vectorDrawables.useSupportLibrary = BuildAndroidConfig.SUPPORT_VECTOR_DRAWABLE
    }

//    buildTypes {
//        getByName(BuildType.RELEASE) {
//            proguardFiles("proguard-android-optimize.txt", "proguard-rules.pro")
//            isMinifyEnabled = BuildTypeRelease.isMinifyEnabled
//            isTestCoverageEnabled = BuildTypeRelease.isTestCoverageEnabled
//        }
//
//        getByName(BuildType.DEBUG) {
//            applicationIdSuffix = BuildTypeDebug.applicationIdSuffix
//            versionNameSuffix = BuildTypeDebug.versionNameSuffix
//            isMinifyEnabled = BuildTypeDebug.isMinifyEnabled
//            isTestCoverageEnabled = BuildTypeDebug.isTestCoverageEnabled
//        }
//    }

    buildFeatures {
        compose =  true
        dataBinding = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.1.1"
    }

    lintOptions {
        lintConfig = rootProject.file(".lint/config.xml")
        isCheckAllWarnings = true
        isWarningsAsErrors = true
    }
}

junitJacoco {
    includeNoLocationClasses = true
}

dependencies {

    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
    implementation("androidx.activity:activity-compose:1.3.1")
    implementation("androidx.compose.ui:ui:1.1.1")
    implementation("androidx.compose.ui:ui-tooling-preview:1.1.1")
    implementation("androidx.compose.material3:material3:1.0.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.1.1")
    debugImplementation("androidx.compose.ui:ui-tooling:1.1.1")
    debugImplementation("androidx.compose.ui:ui-test-manifest:1.1.1")
}