////Include all the existent modules in the project
//rootDir
//    .walk()
//    .maxDepth(1)
//    .filter {
//        it.name != "buildSrc" && it.isDirectory &&
//                file("${it.absolutePath}/build.gradle.kts.kts").exists()
//    }
//    .forEach {
//        include(":${it.name}")
//    }

include(
    ":app",
//    ":core",
//    ":features:home",
//    ":features:characters_list",
//    ":features:characters_favorites",
//    ":libraries:test_utils",
//    ":commons:ui",
//    ":commons:views"
)

rootProject.buildFileName = "build.gradle.kts"