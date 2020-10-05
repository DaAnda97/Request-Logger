FROM openjdk:8-alpine

RUN mkdir /app
COPY target/request-logger-1.0.jar /app/request-logger.jar

CMD java -jar /app/request-logger.jar