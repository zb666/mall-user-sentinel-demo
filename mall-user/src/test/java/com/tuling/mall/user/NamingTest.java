package com.tuling.mall.user;


import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Fox
 */

public class NamingTest {
    
    
    @Test
    public void test() throws Exception{
        // NamingService  注册中心核心服务
//        NamingService namingService = NamingFactory.createNamingService("localhost:8848");
//
//        String serviceName = "mall-user";
//        namingService.registerInstance(serviceName,"localhost",8040);
//        namingService.registerInstance(serviceName,"localhost",8041);
////        Instance instance = new Instance();
////        instance.setEphemeral(false);
////        instance.setIp("localhost");
////        instance.setPort(8042);
////        instance.setServiceName(serviceName);
////        namingService.registerInstance(serviceName,instance);
////
//        System.out.println("获取实例列表"+namingService.selectInstances(serviceName,true));
//        System.out.println("获取一个健康实例"+namingService.selectOneHealthyInstance(serviceName));
//
//        namingService.subscribe(serviceName, new EventListener() {
//            @Override
//            public void onEvent(Event event) {
//                NamingEvent namingEvent = (NamingEvent) event;
//                System.out.println("NamingEvent: "+namingEvent.getInstances());
//            }
//        });
        
        Thread.sleep(Integer.MAX_VALUE);
    }
    
}
