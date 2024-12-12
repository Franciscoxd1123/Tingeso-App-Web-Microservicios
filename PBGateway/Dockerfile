FROM openjdk:17
ARG JAR_FILE=target/PBGateway.jar
COPY ${JAR_FILE} PBGateway.jar
ENTRYPOINT ["java","-jar","/PBGateway.jar"]