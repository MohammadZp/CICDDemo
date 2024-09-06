FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app
COPY demo/demo/target/demo.war /app/demo.war

EXPOSE 8080:8080
ENV TEST="this is just for fun"

ENTRYPOINT ["java", "-jar", "demo.war"]