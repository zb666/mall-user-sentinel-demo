package com.tuling.mall.ribbondemo;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.tuling.mall.rule.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClientName;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,
        DruidDataSourceAutoConfigure.class})
//配置多个   RibbonConfig不能被@SpringbootApplication的@CompentScan扫描到，否则就是全局配置的效果
//@RibbonClients(value = {
//        // 在SpringBoot主程序扫描的包外定义配置类
//        @RibbonClient(name = "mall-order",configuration = com.tuling.mall.rule.RibbonConfig.class),
//        @RibbonClient(name = "mall-account",configuration = com.tuling.mall.rule.RibbonConfig.class)
//})
public class MallUserRibbonDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallUserRibbonDemoApplication.class, args);
    }
}
