FROM openjdk:21
WORKDIR /app
COPY target/User-0.0.1-SNAPSHOT.jar User.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "User.jar"]
