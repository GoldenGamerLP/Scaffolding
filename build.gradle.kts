plugins {
    java
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://jitpack.io")
    }

    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

var minestomVersion = "f774cc3b0f"

dependencies {
    testImplementation("me.alexpanov:free-port-finder:1.1.1")
    compileOnly("com.github.Minestom:Minestom:${minestomVersion}")
    testImplementation("com.github.Minestom:Minestom:${minestomVersion}")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
}

group = "net.crystalgames"
version = "0.1.3-SNAPSHOT"
description = "Scaffolding"
java.sourceCompatibility = JavaVersion.VERSION_17

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}
