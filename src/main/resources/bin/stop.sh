#!/bin/bash

pid=`ps -aux|grep wind-auth-service| grep -v grep | awk '{print $2}'`
if [ -n "$pid" ]; then
	kill -9 $pid
	echo "kill pid : $pid"
fi
echo "stop finish"