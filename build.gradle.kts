plugins {
	java
	id("org.springframework.boot") version "3.5.3"
	id("io.spring.dependency-management") version "1.1.7"
	id ("net.serenity-bdd.serenity-gradle-plugin") version "3.6.7"
}

group = "com.test"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
	implementation("org.springframework.boot:spring-boot-starter-test:3.5.3")
	implementation("io.rest-assured:rest-assured:5.5.5")

	implementation("net.serenity-bdd:serenity-rest-assured:4.2.34")
	implementation("net.serenity-bdd:serenity-single-page-report:4.2.34")
	implementation("com.codeborne:junit4:7.9.4")

	implementation ("org.springframework.boot:spring-boot-starter")
	implementation ("org.springframework.boot:spring-boot-starter-web")
	implementation ("org.springframework.boot:spring-boot-starter-tomcat")
	implementation ("org.springframework:spring-web")


	implementation("net.serenity-bdd:serenity-core:4.2.34")
	implementation("net.serenity-bdd:serenity-cucumber:4.2.34")
	implementation("net.serenity-bdd:serenity-rest-assured:4.2.34")
	testImplementation ("net.serenity-bdd:serenity-spring:3.6.12")
	testImplementation ("net.serenity-bdd:serenity-junit:3.6.12")
	testImplementation ("org.junit.vintage:junit-vintage-engine")
}

//task.named('test'){
//	useJUnit() {}
//	testLogging {
//		showStandardStreams = true
//	}
//	systemProperties System.getProperties()
//}

tasks.withType<Test> {
	useJUnitPlatform()
	testLogging {
		showStandardStreams = true
	}
}

tasks.test {
	useJUnit() {}
	testLogging {
		showStandardStreams = true
	}
//	systemProperties System.getProperties()
}


gradle.startParameter.isContinueOnFailure = true


