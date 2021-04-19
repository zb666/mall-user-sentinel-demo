package com.tuling.mall.feigndemo.remote;

import com.tuling.common.utils.R;
import com.tuling.mall.feigndemo.vo.OrderVo;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author Fox
 */
public interface RemoteService {
    
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @RequestLine("GET /order/findOrderByUserId/{userId}")
    R findOrderByUserId(@Param("userId") Integer userId);
    
    @Headers({"Content-Type: application/json","Accept: application/json"})
    @RequestLine("POST /order/save")
    public R save(@RequestBody OrderVo order);

}
