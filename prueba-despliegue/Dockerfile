FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/prueba-despliegue-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app_negocio.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_negocio.jar"]