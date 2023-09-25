FROM openjdk:17
ADD target/*.jar student-restapi.jar
EXPOSE 8090
ENTRYPOINT [ "java", "-jar", "student-restapi.jar"]