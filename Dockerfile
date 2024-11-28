FROM nginx:1.27.3-alpine3.20

COPY default.conf.template /etc/nginx/conf.d/default.conf.template
COPY reflect_envs.sh /docker-entrypoint.d/reflect_envs.sh
RUN chmod 744 /docker-entrypoint.d/reflect_envs.sh
