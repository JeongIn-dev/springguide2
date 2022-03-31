FROM openjdk:11.0.4-jre-slim
COPY build/libs/springguide2-0.0.1-SNAPSHOT.jar springguide2.jar
ENTRYPOINT ["java", "-jar", "springguide2.jar"]
