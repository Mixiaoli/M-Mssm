package com.mixiao.mssm;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@SpringBootApplication
@ComponentScan("com.mixiao")//去寻找执行com.mixiao下的各种包
@MapperScan("com.mixiao.mssm.mapper")//让系统知道Mapper文件夹是持久层
public class MssmApplication {

    private static final Logger LOG = LoggerFactory.getLogger(MssmApplication.class);

    public static void main(String[] args) {
        //new app 这个主文件.class 然后run主文件 启动后去初始化找Bean 下都有什么 执行什么
        SpringApplication app = new SpringApplication(MssmApplication.class);
        //getProperty 获取 properties 属性文件值的方法 然后赋值给dev然后才能获取打印端口号
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功！！");
        LOG.info("地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }


}
