version = "0.4.1"
description = "Muirwik Components - a Material UI React wrapper written in Kotlin"

plugins {
    id("org.jetbrains.kotlin.js") version "1.3.70"
}

kotlin.target {
    useCommonJs()
    browser { }
}

repositories {
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    maven("https://kotlin.bintray.com/kotlin-js-wrappers/")
    mavenCentral()
    jcenter()
}

dependencies {
    val kotlinReactVersion = "16.13.0-pre.93-kotlin-1.3.70"
    implementation(kotlin("stdlib-js"))
    implementation("org.jetbrains:kotlin-react:$kotlinReactVersion")
    implementation("org.jetbrains:kotlin-react-dom:$kotlinReactVersion")
    implementation("org.jetbrains:kotlin-styled:1.0.0-pre.93-kotlin-1.3.70")

    implementation(npm("react", "16.13.0"))
    implementation(npm("react-dom", "16.13.0"))

    implementation(npm("styled-components"))
    implementation(npm("inline-style-prefixer"))

    implementation(npm("@material-ui/core"))
    implementation(npm("@material-ui/icons"))

}