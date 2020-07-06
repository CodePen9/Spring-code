package com.jiang.bean;/*
 *
 * @author JiangPeng
 * @My code no bug
 */

import java.util.List;
import java.util.Map;
import java.util.Properties;


public class Person {
    private String lastName;
    private String gender;
    private Integer age;
    private String email;

    private Car car;
    private List<Book> books;
    private Map<String,Object> maps;
    private Properties properties;


    public Person(Car car) {
        this.car = car;
        System.out.println("可以为car赋值的有参构造器...");
    }

    public Person() {
        System.out.println("person容器被创建了");
    }

    //public Person(String lastName, String gender, Integer age, String email) {
    //    this.lastName = lastName;
    //    this.gender = gender;
    //    this.age = age;
    //    this.email = email;
    //    System.out.println("有参构造器...");
    //}

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", car=" + car +
                ", books=" + books +
                ", maps=" + maps +
                ", properties=" + properties +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        System.out.println("set方法进行赋值");
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
