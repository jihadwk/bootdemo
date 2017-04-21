spring boot 是springmvc的脚手架，配置全部采用默认配置，快速
spring cloud 是基于spring boot 分布式实现框架，有服务注册，服务发现
Spring Cloud 为开发者提供了在分布式系统（如配置管理、服务发现、断路器、智能路由、微代理、控制总线、一次性 Token、全局锁、决策竞选、分布
式会话和集群状态）操作的开发工具
spring cloud = zk + dubbo + deploy

之前用户使用的是3个注解注解他们的main类。分别是@Configuration,@EnableAutoConfiguration,@ComponentScan。由于这些注解一般都是一起使用，spring boot提供了一个统一的注解@SpringBootApplication。

@SpringBootApplication = (默认属性)@Configuration + @EnableAutoConfiguration + @ComponentScan。

File -> Settings -> Editor -> File Encodings

将Properties Files (*.properties)下的Default encoding for properties files设置为UTF-8，将Transparent native-to-ascii conversion前的勾选上。