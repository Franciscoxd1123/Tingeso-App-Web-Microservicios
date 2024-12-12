FROM openjdk:17
ARG JAR_FILE=target/PBEureka.jar
COPY ${JAR_FILE} PBEureka.jar
ENTRYPOINT ["java","-jar","/PBEureka.jar"]