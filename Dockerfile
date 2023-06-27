# Build stage
FROM adoptopenjdk/openjdk11:latest
RUN apt-get update
RUN apt-get install -y maven
COPY src /home/app/src
COPY pom.xml /home/app
COPY target/SumFromFile-test.jar /home/app/target/SumFromFile-test.jar
WORKDIR /home/app
RUN mvn package
CMD ["java","-cp","target/SumFromFile-test.jar","SumFromFile"]
