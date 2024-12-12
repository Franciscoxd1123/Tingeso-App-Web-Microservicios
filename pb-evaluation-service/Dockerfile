FROM openjdk:17
ARG JAR_FILE=target/PBEvaluation.jar
COPY ${JAR_FILE} PBEvaluation.jar
ENTRYPOINT ["java","-jar","/PBEvaluation.jar"]