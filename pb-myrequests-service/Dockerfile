FROM openjdk:17
ARG JAR_FILE=target/PBMyRequests.jar
COPY ${JAR_FILE} PBMyRequests.jar
ENTRYPOINT ["java","-jar","/PBMyRequests.jar"]