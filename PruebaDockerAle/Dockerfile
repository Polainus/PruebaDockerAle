FROM openjdk:17-jdk-slim

# Instala el cliente MySQL
RUN apt-get update && apt-get install -y default-mysql-client

COPY target/Prueba-0.0.1-SNAPSHOT.jar /app/Prueba-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "/app/Prueba-0.0.1-SNAPSHOT.jar"]
