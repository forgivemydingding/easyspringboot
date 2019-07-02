package com.demo.easy.springboot.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author by liu.hongda
 * @Description TODO
 * @Date 2019/7/2 14:14
 */

@Component
@ConfigurationProperties(prefix = "test")
@Data
public class ConfigPrefixIsTest {

    private Integer a;
    private Integer b;
    private Integer c;
    private long d;
    private String value;
    private String uuid;
}
