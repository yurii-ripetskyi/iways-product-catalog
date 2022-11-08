FROM openjdk:17-jdk-alpine
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} app.jar

ENV JAVA_OPTS="-Dspring.profiles.active=test -Dsecurity.cloud.config.password=4ne6Nn58ZYfAVdXaP6xg -Dsecurity.cloud.config.username=configprod -Dsecurity.cloud.config.uri=https://prod.configuration.spring.pbx/"

RUN apk update \
    && apk add openssl \
    && openssl s_client -connect prod.configuration.spring.pbx:443 -showcerts < /dev/null | sed -ne '/-BEGIN CERTIFICATE-/,/-END CERTIFICATE-/p' > certificates.crt \
    && keytool -cacerts -import -alias photobox -file certificates.crt -trustcacerts -noprompt -storepass changeit

ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar /app.jar"]

EXPOSE 8080
