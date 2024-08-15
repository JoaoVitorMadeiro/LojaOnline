FROM springcloud/eureka:latest
WORKDIR /app
COPY /target/EurekaServer-0.0.1-SNAPSHOT.jar eureka.jar
EXPOSE 8761
ENTRYPOINT java -jar eureka.jar
LABEL authors="João Vitor"

