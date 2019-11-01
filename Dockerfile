FROM openjdk:12
COPY build/libs/brewery-0.0.1-SNAPSHOT.jar ./
ENTRYPOINT ["java"]
CMD ["-jar", "/brewery-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080