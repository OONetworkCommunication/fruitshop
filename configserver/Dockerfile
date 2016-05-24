FROM java:8
COPY /target/configserver-0.0.1-SNAPSHOT.jar /data/
EXPOSE 8888
WORKDIR /data/ 
CMD ["java", "-jar", "configserver-0.0.1-SNAPSHOT.jar"]
