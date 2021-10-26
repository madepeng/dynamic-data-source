# Sharding-Sphere示例
### 支持版本
- 4.x
### 实现功能
- 多数据源
- 读写分离
- XA分布式事务
### 说明
Sharding-Sphere(Sharding-JDBC)是一款功能强大的，java客户端数据库插件，无侵入实现分库分表、读写分离、分布式事务等功能。

业务分了多个数据库，需要多数据源切换和读写分离，并且保证数据一致性。

### 技术概述
DataSourceAop 通过AOP不通包路径动态指定数据源。

MyDatasourceRoutingAlgorithm 强制路由策略，根据AOP指定的数据源进行强制路由。

当不需要分布式事务的地方，去掉这个注解@ShardingTransactionType(TransactionType.XA)，或者使用@ShardingTransactionType(TransactionType.LOCAL)，分布式事务性能比较差
