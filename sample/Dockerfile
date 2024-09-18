# Use an official JDK 22 image as a base image
FROM openjdk:22-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the application JAR file or project to the working directory
# (assuming you have built the app and have the jar file)
COPY target/sample-project.jar /app/sample.jar

# Expose port 8080
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "sample.jar"]
