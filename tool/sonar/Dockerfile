FROM sonarqube:community

EXPOSE 9000

COPY plugins /opt/sonarqube/extensions/plugins
COPY sonar.properties /opt/sonarqube/conf/

USER root

ENV JAVA_HOME /usr/local/java-1.8-openjdk-1.8
ENV PATH="${JAVA_HOME}/bin:${PATH}"