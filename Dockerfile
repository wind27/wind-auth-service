FROM qianchun27/centos7-jdk8

MAINTAINER qianchun, qinachun@huli.com

RUN yum install -y git;
RUN yum install -y maven;

RUN cd /; git clone https://github.com/wind27/wind-auth-service.git -b master; cd wind-auth-service;

#mvn clean package --settings /wind-auth-service/settings.xml;
#ENTRYPOINT ["java", "-jar", "/wind-auth-web/target/wind-auth-service-0.0.1-SNAPSHOT.jar"]