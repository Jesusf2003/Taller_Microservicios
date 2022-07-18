FROM openjdk:11

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} product-service.jar

EXPOSE 9001

ENTRYPOINT [ "java", "-jar", "/product-service.jar" ]