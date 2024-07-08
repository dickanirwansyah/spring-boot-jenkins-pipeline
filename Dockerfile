#initiate JAVA 17
FROM openjdk:17-jdk-slim
#initiate file jar and copy location
ARG JAR_FILE=target/spring-boot-jenkins-0.0.1-SNAPSHOT.jar
#add application jar to container
COPY ${JAR_FILE} app.jar
#expose the port the application runs on
EXPOSE 6767
#run application .jar file
ENTRYPOINT ["java","-jar","/app.jar"]