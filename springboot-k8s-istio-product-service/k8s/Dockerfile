# 基于哪个镜像
FROM openjdk:8
# 将本地文件挂载到容器
VOLUME /tmp
# 拷贝文件到容器
ADD springboot-k8s-istio-product-service-1.0.0.jar product-service.jar
ENV JAVA_OPTS=""
# 声明要暴露的端口
EXPOSE 9002
# 配置容器启动后执行命令，并指定使用项目外部的配置文件等
CMD java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -Duser.timezone=GMT+8 -jar /product-service.jar
