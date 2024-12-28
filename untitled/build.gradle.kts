plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}
build.gradledependencies {
    testRuntime("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntime("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    testRuntime("org.junit.jupiter:junit-jupiter-params:5.8.1")
    testRuntime("org.junit.platform:junit-platform-suite:1.8.1")
}
test {
    useJUnitPlatform()
}

tasks.test {
    useJUnitPlatform()
}