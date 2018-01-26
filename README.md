# menu
两个数据源间的数据转移处理

1. DataSourceConfig 
    两个数据源必须设置一个主数据源，以@Primary注解标识，springboot默认会根据类型注入@Primary注解的数据源
2. MybatisConfig
    数据源注入不使用@Autowired @Qualifier注解注入DataSource,将DataSource以方法参数的方式注入
3. MyBatisMapperScannerConfig
    MapperScannerConfigurer.setSqlSessionFactory(SqlSessionFactory) 方法不推荐使用，使用 MapperScannerConfigurer.setSqlSessionFactoryBeanName("")注入SqlSessionFactory；