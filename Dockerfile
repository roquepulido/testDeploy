FROM openjdk:17-alpine
ADD target/flujo.core*.jar app.jar
ENV TZ=America/Mexico_City
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]