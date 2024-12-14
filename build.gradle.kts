plugins {
    id("java")
    id("io.spring.dependency-management") version "1.1.6"
    id("org.springframework.boot") version "2.5.3"
}

group = "com.sergemenko"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
//Spring
dependencies{
    implementation("org.springframework.boot", "spring-boot-starter-web")
    implementation("org.springframework.boot", "spring-boot-starter-data-jpa")
}
//Other
dependencies{
    implementation("org.postgresql","postgresql","42.2.19")
}
//Lombok
dependencies{
    compileOnly("org.projectlombok:lombok:1.18.20" )
    testCompileOnly("org.projectlombok:lombok:1.18.20")
    annotationProcessor("org.projectlombok:lombok:1.18.20")
    testAnnotationProcessor ("org.projectlombok:lombok:1.18.20")
}
dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}