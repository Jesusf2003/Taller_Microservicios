FROM openjdk:11

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} eureka-server.jar

EXPOSE 8099

ENTRYPOINT [ "java", "-jar", "/eureka-server.jar" ]