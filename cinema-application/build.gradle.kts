plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

dependencies {
    implementation(project(":cinema-domain"))
    implementation(project(":cinema-infrastructure"))
    
    implementation("org.springframework.boot:spring-boot-starter")
    
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.getByName("bootJar") {
    enabled = false
}

tasks.getByName("jar") {
    enabled = true
} 