# dome
spring cloud alibaba dome
# 安装nacos 做为注册中心
# 参考 https://nacos.io/zh-cn/docs/what-is-nacos.html 

git clone https://github.com/nacos-group/nacos-docker.git

cd nacos-docker

docker-compose -f example/standalone-derby.yaml up

# 安装 Sentinel  做流控中心


# 使用 Micrometer 收集应用数据