## 基于ribbon+restTemplate的消费者示例
* 项目依赖  
    * springMVC添加spring-boot-starter-web依赖  
    * 作为eureka-client添加spring-cloud-starter-netflix-eureka-client依赖  
    * 客户端负载均衡feign 依赖spring-cloud-starter-openfeign
    * 监控模块spring-boot-starter-actuator
    * 断路器依赖spring-cloud-starter-netflix-hystrix
    * 断路器监控 Hystrix Dashboard spring-cloud-starter-netflix-hystrix-dashboard
    * 断路器聚合监控 Hystrix Turbine spring-cloud-starter-netflix-turbine
    * 集成链路追踪添加spring-cloud-starter-zipkin依赖