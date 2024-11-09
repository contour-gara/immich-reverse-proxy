#!/bin/sh

envsubst '$IMMICH_ADDRESS' < /etc/nginx/conf.d/default.conf.template > /etc/nginx/conf.d/default.conf
echo `cat /etc/nginx/conf.d/default.conf`
