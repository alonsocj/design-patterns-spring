FROM maven:3.6.3-jdk-8 AS build
WORKDIR /app
COPY . .
RUN mvn install

FROM openjdk:8-jdk-alpine
EXPOSE 8080
COPY --from=build /app/target/design-patterns-spring.jar .
ENTRYPOINT [ "java","-jar","/design-patterns-spring.jar" ]