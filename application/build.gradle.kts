dependencies {
    implementation("org.springframework.boot:spring-boot-starter:3.4.3")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.4.3")

    implementation(project(":domain"))
    implementation(project(":infrastructure"))
}
