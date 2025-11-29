# Use an official Maven image as a parent image
FROM maven:latest

LABEL authors="joni"

WORKDIR /app
COPY pom.xml /app
COPY src /app/src
RUN mvn clean package
CMD ["java", "-jar", "target/assignment_5.jar"]