FROM amazoncorretto:17-alpine-jdk
LABEL maintainer="yannqing <yannqing.com>"
LABEL version="1.0"
LABEL description="test Jenkins"
WORKDIR /yannqing/java
VOLUME /yannqing/logs
COPY target/*.jar /tmp/app.jar
EXPOSE 8082
ENTRYPOINT nohup java -jar /tmp/app.jar > /yannqing/logs/output.log $
