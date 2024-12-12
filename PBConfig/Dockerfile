FROM openjdk:17
ARG JAR_FILE=target/PBConfig.jar
COPY ${JAR_FILE} PBConfig.jar
ENTRYPOINT ["java","-jar","/PBConfig.jar"]