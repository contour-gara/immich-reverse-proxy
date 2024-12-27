plugins {
    kotlin("jvm") version "2.1.0"
    id("org.gauge") version "2.1.0"
}

group = "org.contourgara"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("com.thoughtworks.gauge:gauge-java:0.11.2")
    testImplementation("org.assertj:assertj-core:3.27.0")
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}
