FROM nginx:1.27.2-alpine-slim

COPY default.conf.template /etc/nginx/conf.d/default.conf.template
COPY reflect_envs.sh /docker-entrypoint.d/reflect_envs.sh
RUN chmod 744 /docker-entrypoint.d/reflect_envs.sh
