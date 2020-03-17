FROM maven:3.6.3-jdk-11-slim

WORKDIR /app

COPY ./ /app/

RUN mvn dependency:resolve

RUN mvn clean package -DskipTests

CMD java -jar target/springbootdemo-0.0.1-SNAPSHOT.jar