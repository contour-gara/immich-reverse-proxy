plugins {
    kotlin("jvm") version "2.1.0"
    id("org.gauge") version "1.8.2"
}

group "org.contourgara"
version "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

dependencies {
    testImplementation("com.thoughtworks.gauge:gauge-java:0.7.15")
    testImplementation("org.assertj:assertj-core:3.20.2")
}
