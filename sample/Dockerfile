# Use an official JDK 22 image as a base image
FROM openjdk:22-jdk-slim


# Set the working directory in the container
WORKDIR /app

# Copy the Maven project files
COPY pom.xml .
COPY src ./src

# Install Maven
RUN apt-get update && apt-get install -y maven

# Build the Spring Boot application
RUN mvn clean package

# Copy the JAR file to the container
COPY target/sample-project.jar /app/sample.jar

# Expose port 8080
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "/app/sample.jar"]
