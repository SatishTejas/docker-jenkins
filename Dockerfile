FROM openjdk:8
EXPOSE 8080
ADD target/dockerjenkins.jar dockerjenkins.jar
ENTRYPOINT ["java","-jar","/dockerjenkins.jar"]