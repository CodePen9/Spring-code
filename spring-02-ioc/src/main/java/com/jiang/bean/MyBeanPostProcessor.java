package com.jiang.bean;
/**
 * @author JiangPeng
 * @Code no bug
 */

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/*
    使用：
    1.编写后置处理器的实现类
    2.将后置处理器注册在配置文件中
 */

public class MyBeanPostProcessor implements BeanPostProcessor {

   /*
      postProcessBeforeInitialization:初始化之前调用
      Object bean：将要初始化的bean
      String beanName：bean在xml中配置的id
    */
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName+"将要调用初始化方法了...这个bean是这样"+bean);

        return bean;//这里我们要返回传入的bean
    }

    /*
        postProcessAfterInitialization：初始化方法之后调用
     */

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName+"初始化方法调用完了...这个bean是这样"+bean);

        return bean;//这里我们要返回传入的bean
    }
}
