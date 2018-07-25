#!/bin/bash

pid=`ps -aux|grep wind-auth-service| grep -v grep | awk '{print $2}'`
if [ $pid ]; then
	echo "server is starting"
	exit 0
fi

nohup java -Ddev=DEV -Ddev_meta=http://apollo:8080 -jar /opt/server/wind-auth-service/lib/wind-auth-service-0.0.1-SNAPSHOT.jar &