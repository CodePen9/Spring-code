package com.jiang.factory;/*
 *
 * @author JiangPeng
 * @My code no bug
 */

import com.jiang.bean.Book;
import org.springframework.beans.factory.FactoryBean;

import java.util.UUID;

/**
 * 实现了FactoryBean接口的类都是Spring可以识别的工厂类
 * Spring会自动调用工厂方法创建实例
 *
 * 使用:1.编写一个FactoryBean的实现类
 *      2.在Spring配置文件中进行注册
 */
public class MyFactoryBeanImpl implements FactoryBean {

    //getObject:工厂方法,返回创建的对象
    public Object getObject() throws Exception {
        System.out.println("MyFactoryBeanImpl...创建对象");
        Book book = new Book();
        book.setBookName(UUID.randomUUID().toString());
        return book;
    }

    //getObjectType:返回创建对象的类型
    //Spring会自动调用这个方法来确认创建的对象是什么类型
    public Class<?> getObjectType() {
        return null;
    }

    //isSingleton:是单例吗? false:不是;true:是
    public boolean isSingleton() {
        return false;
    }
}
