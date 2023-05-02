FROM openjdk:11
ADD target/notification-ws-0.0.1-SNAPSHOT.jar notification-ws-0.0.1-SNAPSHOT.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "notification-ws-0.0.1-SNAPSHOT.jar"]
