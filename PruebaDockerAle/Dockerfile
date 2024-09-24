# Usa una imagen base de OpenJDK
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo en el contenedor
WORKDIR /app

# Copia el archivo JAR de tu aplicación al contenedor
COPY target/Prueba-0.0.1-SNAPSHOT.jar /app/Prueba-0.0.1-SNAPSHOT.jar

# Expone el puerto en el que se ejecutará la aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "/app/Prueba-0.0.1-SNAPSHOT.jar"]
