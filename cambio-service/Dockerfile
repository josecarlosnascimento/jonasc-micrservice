FROM openjdk:11-slim
ARG JAR_FILE=cambio-service/target/*.jar
COPY ${JAR_FILE} app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.edg=file:/dev/./urandim","-jar","/app.jar"]