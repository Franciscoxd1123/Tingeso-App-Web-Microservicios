FROM openjdk:17
ARG JAR_FILE=target/PBSimulation.jar
COPY ${JAR_FILE} PBSimulation.jar
ENTRYPOINT ["java","-jar","/PBSimulation.jar"]