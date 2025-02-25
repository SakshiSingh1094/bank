# start with base image with java runtime
#FROM openjdk:17-jdk-slim
FROM eclipse-temurin:21-jdk
#who is maintaining the images
MAINTAINER sakshisingh1094

# add application jar to image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]
