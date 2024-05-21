FROM openjdk:17
WORKDIR /usr/src
EXPOSE 8085
ADD  ./target/deploy-ec2-0.0.1-SNAPSHOT.jar /usr/src/deploy-ec2-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/usr/src/deploy-ec2-0.0.1-SNAPSHOT.jar"]

 
