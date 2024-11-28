#!/bin/sh

envsubst '$MY_GLOBAL_IP $IMMICH_PORT' < /etc/nginx/conf.d/default.conf.template > /etc/nginx/conf.d/default.conf
echo `cat /etc/nginx/conf.d/default.conf`
