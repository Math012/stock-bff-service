FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY build/libs/stock-bff-service-0.0.1-SNAPSHOT.jar /app/stock-bff-service.jar

EXPOSE 8085

CMD ["java", "-jar", "/app/stock-bff-service.jar"]