FROM openjdk:17
ARG JAR_FILE=target/PBRequest.jar
COPY ${JAR_FILE} PBRequest.jar
ENTRYPOINT ["java","-jar","/PBRequest.jar"]