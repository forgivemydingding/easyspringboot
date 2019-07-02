package com.demo.easy.springboot.pojo;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author by liu.hongda
 * @description Spring可以通过注解@Value(“${属性名}”)来加载对应的配置属性，然后将属性值赋值给注解对应的实体属性。
 * @date 2019/7/2 11:05
 */

@Component
@Getter
public class ConfigProperties {

    /**
     * 可在配置里找到对应值
     */
    @Value("${author.name}")
    private String name;

    @Value("${author.email}")
    private String email;

    @Value("${contact.information}")
    private String contact;
}
