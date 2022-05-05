FROM openjdk:17-ea-11-jdk-slim
CMD ["./gradlew", "clean", "build"]
VOLUME /tmp
COPY build/libs/springDiscovery-0.0.1-SNAPSHOT.jar DiscoveryService.jar
ENTRYPOINT ["java","-jar","DiscoveryService.jar"]