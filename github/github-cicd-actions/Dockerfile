FROM openjdk:8
EXPOSE 8080
ADD target/github.jar github.jar
ENTRYPOINT ["jar", "-jar", "/github.jar"]
