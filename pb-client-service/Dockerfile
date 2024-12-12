FROM openjdk:17
ARG JAR_FILE=target/PBClient.jar
COPY ${JAR_FILE} PBClient.jar
ENTRYPOINT ["java","-jar","/PBClient.jar"]