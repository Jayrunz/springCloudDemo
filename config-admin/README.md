#配置文件管理示例 config-admin 基于[spring-cloud-config-admin](https://github.com/dyc87112/spring-cloud-config-admin)
* 简介  
spring-cloud-config虽然在spring-cloud架构中担任配置中心的角色,但是在配置的管理上比较欠缺,于是就有了[spring-cloud-config-admin](https://github.com/dyc87112/spring-cloud-config-admin)(SCCA)。  
* 实现方案  
本项目采用SCCA提供的半分离模式的方案，集成了核心模块(SCCA REST)和前端模块(SCCA UI)与配置中心项目(config-server-ha)配合使用，二者基于springCloud的服务注册发现。spring-cloud-config支持Git和DB两种存储模式，本项目采用Git的存储方式。