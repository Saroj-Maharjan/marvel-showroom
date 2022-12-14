/**
 * Configuration of the Android build.
 */

object BuildAndroidConfig {
    const val APPLICATION_ID = "com.sawrose.marvel_showroom"


    const val COMPILE_SDK_VERSION = 33
    const val MIN_SDK_VERSION = 21
    const val TARGET_SDK_VERSION = 33

    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0"

    const val SUPPORT_VECTOR_DRAWABLE = true

    const val TEST_INSTRUMENTATION_RUNNER = "androidx.test.runner.AndroidJUnitRunner"
    val TEST_INSTRUMENTATION_RUNNER_ARGUMENTS = mapOf(
        "leakcanary.FailTestOnLeakRunListener" to "listener"
    )
}