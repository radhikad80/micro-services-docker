FROM openjdk:17
COPY target/*.jar education-gateway.jar
EXPOSE 8222
ENTRYPOINT ["java", "-jar", "education-gateway.jar"]