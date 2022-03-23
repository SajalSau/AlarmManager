FROM openjdk:8
EXPOSE 8085

ADD target/alarm-processor.jar alarm-processor.jar
ENTRYPOINT ["java","-jar","/alarm-processor.jar"]