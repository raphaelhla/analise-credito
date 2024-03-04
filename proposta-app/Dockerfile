FROM openjdk:17

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} proposta-app.jar

COPY wait-for-it.sh .

RUN chmod +x wait-for-it.sh

EXPOSE 8080

ENTRYPOINT ["./wait-for-it.sh", "rabbit-mq:5672", "--", "java", "-Duser.language=pt", "-Duser.country=BR", "-jar", "proposta-app.jar"]
