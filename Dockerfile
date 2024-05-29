FROM maven:3.3.1-jdk22 AS build
COPY src /usr/src/app/src
WORKDIR /usr/src/app
RUN mvn clean package

FROM openjdk:22
EXPOSE 8080
RUN mkdir /app
COPY --from=build /usr/src/app/target/app.jar /app/app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]