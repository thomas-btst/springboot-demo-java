# --- Stage 1: Build with Maven ---
FROM maven:3.9.11-eclipse-temurin-24
WORKDIR /app
COPY pom.xml .
# RUN mvn dependency:go-offline -B
RUN mvn -B -e -C dependency:resolve dependency:resolve-plugins
COPY src ./src
RUN mvn package -DskipTests

# Run the Spring Boot app directly
ENTRYPOINT ["/bin/bash", "-c", "java -jar target/*.jar"]