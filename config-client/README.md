#基础版的config-client  
* 通过ip从config-server获取配置
* 集成了消息总线spring Cloud Bus  
    * 消息总线依赖rabbitmq,需要安装。
    * 在更新配置后，发送post请求：http://{client-ip}:{port}/actuator/bus-refresh即可刷新client配置，不需要重启服务。