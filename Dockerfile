FROM maven:3.8.5-openjdk-17
WORKDIR /usr/src/app
COPY pom.xml ./
COPY . .