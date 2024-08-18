/*
 * This file was generated by the Gradle 'init' task.
 */

import java.io.File

plugins {
    `java-library`
}

group = "io.github.adamkorcz"
version = "0.3.60"
description = "Adams test java project"
java.sourceCompatibility = JavaVersion.VERSION_1_8

java {
    withSourcesJar()
    withJavadocJar()
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "hello.HelloWorld"
    }
}
