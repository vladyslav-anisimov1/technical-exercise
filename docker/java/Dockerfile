FROM openjdk:11

RUN apt update && apt install -y git maven

COPY src /project/src
COPY pom.xml /project

WORKDIR /project

RUN mvn package

ENTRYPOINT [ "java", "-jar", "target/technical-exercise-1.0-SNAPSHOT.jar" ]
EXPOSE 80