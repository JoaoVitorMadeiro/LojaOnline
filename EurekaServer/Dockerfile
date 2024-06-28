FROM openjdk:22
WORKDIR /app
COPY ./src/main/java/com/lojaonline/eurekaserver/EurekaServerApplication.java app.jar
EXPOSE 8761
ENTRYPOINT java -jar app.jar
LABEL authors="João Vitor"

