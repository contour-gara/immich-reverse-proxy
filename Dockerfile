FROM nginx:1.27.3-alpine3.20-slim

COPY reverseproxy/default.conf.template /etc/nginx/conf.d/default.conf.template
COPY reverseproxy/reflect_envs.sh /docker-entrypoint.d/reflect_envs.sh
RUN chmod 744 /docker-entrypoint.d/reflect_envs.sh
