# dome
spring cloud alibaba dome

# 模块规则
common 基础共享模块

engine 业务模块

engine-api 业务api，远程调用

gateway 业务网关

# 安装nacos 做为注册中心
# 参考 https://nacos.io/zh-cn/docs/what-is-nacos.html 

git clone https://github.com/nacos-group/nacos-docker.git

cd nacos-docker

docker-compose -f example/standalone-derby.yaml up

# 安装 Sentinel  做流控中心
docker pull bladex/sentinel-dashboard

docker run --name sentinel -d -p 8858:8858 -d bladex/sentinel-dashboard

访问： http://localhost:8858/   密码 sentinel/ sentinel

# 使用 Micrometer 收集应用数据
# jenkins 持续集成
# k8s 自动部署
# ELK 日志收集
# SkyWalking 全链路追踪