import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion

plugins {
    kotlin("jvm") version "2.1.0"
    id("org.gauge") version "2.1.0"
    id("com.avast.gradle.docker-compose") version "0.17.12"
}

group = "org.contourgara"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("com.thoughtworks.gauge:gauge-java:0.11.2")
    testImplementation("io.rest-assured:rest-assured:5.5.0")
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

kotlin {
    compilerOptions {
        apiVersion.set(KotlinVersion.KOTLIN_2_0)
        jvmTarget.set(JvmTarget.JVM_21)
        freeCompilerArgs.add("-Xjsr305=strict")
    }
}

val integrationTest = tasks.register<Test>("integrationTest") {
    description = "Runs integration tests."
    dependsOn("composeUp", "gauge")
    finalizedBy("composeDown")
}

dockerCompose {
    useComposeFiles = listOf("./compose.yml", "./compose.test.yml")
    composeAdditionalArgs = listOf("--compatibility")
}
