package com.tuling.mall.rule;

import com.alibaba.cloud.nacos.ribbon.NacosRule;
import com.netflix.loadbalancer.IRule;
import com.tuling.mall.ribbondemo.rule.NacosRandomWithWeightRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Fox
 */
@Configuration
public class RibbonConfig {

    @Bean
    public IRule ribbonRule() {
        return new NacosRandomWithWeightRule();
    }
}
