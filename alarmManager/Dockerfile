FROM openjdk:8
EXPOSE 8085

ADD target/alarm-manager.jar alarm-manager.jar
ENTRYPOINT ["java","-jar","/alarm-manager.jar"]