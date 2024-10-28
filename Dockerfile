FROM openjdk:19-jdk-slim
COPY target/Restobar-CavaDorada-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]

