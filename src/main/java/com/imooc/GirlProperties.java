package com.imooc;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Liam Liu
 * @date 2018/5/28 11:19
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {
    private  String cupSize;

    private  Integer age;

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
