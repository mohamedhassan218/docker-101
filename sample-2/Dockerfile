# Use Java 21 runtime image
FROM eclipse-temurin:21-jre

# Set working directory
WORKDIR /app

# Copy the generated JAR file
COPY target/*.jar app.jar

# Expose application port
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]