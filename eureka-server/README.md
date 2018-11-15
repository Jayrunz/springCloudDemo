# eureka注册中心
* 项目依赖   
    * 只需依赖pring-cloud-starter-netflix-eureka-server即可，见pom。
* 配置文件    
    * 单机注册中心配置  
    application.yml  
    * 高可用注册中心配置(此处以两个实例在同一台机器上为例)  
    application-node1.yml、application-node2.yml  
        ***ps***: 两个实例相互注册时的名称(IP/hostname)不能相同，否则eureka会认为副本unavailable，故在一台机器测试时可修改host实现，添加：  
        ```
        127.0.0.1 eureka-server-ha-node1
        127.0.0.1 eureka-server-ha-node2
        ```
* 启动项目   
    * 单机启动  
    run主程序或 java -jar xxx.jar  
    * 高可用启动
    分别以node1和node2为profile启动即可  
    eg:  
        ```
        java -jar xxx.jar -spring.profiles.active=node1
        ```