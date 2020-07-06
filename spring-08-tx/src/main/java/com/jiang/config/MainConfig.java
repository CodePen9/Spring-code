package com.jiang.config;

import com.jiang.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Title:
 * @author: JiangPeng
 */

@Configuration
@ComponentScan(value = "com.jiang")
//告诉Spring这是一个配置文件 配置类==配置文件，代替beans.xml
public class MainConfig {

    @Bean("jwj")
    //注册一个bean
    //类型为返回值的类型。
    //id则是默认方法名
    public Person person(){
        return new Person("jwj",18);
    }
}
