package com.tuling.mall.feigndemo.remote;

import com.tuling.mall.feigndemo.vo.OrderVo;
import feign.Feign;
import feign.Request;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;


/**
 * @author Fox
 */

public class FeignDemo {

    public static void main(String[] args) {

        //基于json
        // encoder指定对象编码方式，decoder指定对象解码方式
        RemoteService service = Feign.builder()
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .options(new Request.Options(1000, 3500))
                //.retryer(new Retryer.Default(5000, 5000, 3))
                .target(RemoteService.class, "http://localhost:8020/");

        System.out.println(service.findOrderByUserId(1));
        
//        OrderVo vo = new OrderVo();
//        vo.setCommodityCode("C000003");
//        vo.setUserId(1);
//        vo.setCount(5);
//        vo.setAmount(200);
//        service.save(vo);
//
//        System.out.println(service.findOrderByUserId(1));
    }

}
