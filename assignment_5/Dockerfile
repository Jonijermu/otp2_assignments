# Use an official Maven image as a parent image
FROM maven:latest

LABEL authors="joni"

# Set working directory
WORKDIR /app

# Copy the full project (all modules)
COPY pom.xml /app/

# Copy the rest of the project
COPY . /app/

# Build the full multi-module project
RUN mvn clean install -DskipTests

# Run the JAR produced for assignment_5
CMD ["java", "-jar", "target/assignment_5.jar"]