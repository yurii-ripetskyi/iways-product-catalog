FROM openjdk:17-jdk-alpine
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} app.jar

#ENV JAVA_OPTS="-Dsecurity.cloud.config.password=4ne6Nn58ZYfAVdXaP6xg -Dsecurity.cloud.config.username=configprod -Dsecurity.cloud.config.uri=https://prod.configuration.spring.pbx/"

ENTRYPOINT ["java","-Dsecurity.cloud.config.password=4ne6Nn58ZYfAVdXaP6xg","-Dsecurity.cloud.config.username=configprod","-Dsecurity.cloud.config.uri=https://prod.configuration.spring.pbx/","-jar","/app.jar"]