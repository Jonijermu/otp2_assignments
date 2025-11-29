# Use an official Maven image as a parent image
FROM maven:latest

LABEL authors="joni"

WORKDIR /app/assignment_5
COPY assignment_5 /app/assignment_5
RUN mvn clean package -DskipTests
CMD ["java", "-jar", "target/assignment_5.jar"]