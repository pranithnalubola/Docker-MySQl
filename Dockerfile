FROM eclipse-temurin:17
LABEL maintainer="pranithnalubola@gmail.com"
WORKDIR /app
COPY target/Docker-Dockerfile-demo-0.0.1-SNAPSHOT.jar /app/springboot-docker.jar
ENTRYPOINT [ "java", "-jar", "springboot-docker.jar" ]
