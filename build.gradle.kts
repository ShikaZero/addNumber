import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
}
group = "me.ptgm6562"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
dependencies {
    implementation("junit:junit:4.12")
    // ReactiveX
    implementation("io.reactivex.rxjava2:rxjava:2.2.10")
    implementation("org.junit.jupiter:junit-jupiter:5.4.2")
}
tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}