FROM openjdk:8-jdk-alpine
EXPOSE 8085
ARG JAR_FILE=userservice-0.0.1-SNAPSHOT.jar
COPY target/${JAR_FILE} userservice.jar
ENTRYPOINT ["java","-jar","/userservice.jar"]