package com.tuling.mall.ribbondemo.interceptor;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.*;

@Target({ ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Qualifier  // 限定符
public @interface MyLoadBalanced {
}
