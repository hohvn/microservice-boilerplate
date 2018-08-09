#-----------------------------------------------------------------------------------------------------
# Eureka Server
#-----------------------------------------------------------------------------------------------------
FROM openjdk:8u121-jdk-alpine

MAINTAINER Thai Tran <vanthai1986@gmail.com>

# Keep consistent with build.gradle
ENV APP_JAR_NAME eureka-server
ENV APP_JAR_VERSION 1.0-SNAPSHOT

# Install curl
RUN apk --update add curl bash && \
	rm -rf /var/cache/apk/*

RUN mkdir /app

ADD ${APP_JAR_NAME}-${APP_JAR_VERSION}.jar /app/
ADD run.sh /app/
RUN chmod +x /app/run.sh

WORKDIR /app

EXPOSE 8761

ENTRYPOINT ["/bin/bash","-c"]
CMD ["/app/run.sh"]