FROM openjdk:17
COPY target/*.jar discovery.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "discovery.jar"]