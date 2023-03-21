FROM openjdk:17
ADD target/maven-docker.jar maven-docker.jar
CMD ["java", "-jar","maven-docker.jar"]