FROM openjdk:17-alpine
COPY target/demo*.jar app.jar
ENV TZ=America/Mexico_City
ENTRYPOINT ["java","-jar","/app.jar"]