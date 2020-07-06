package com.jiang.bean;/*
 *
 * @author JiangPeng
 * @My code no bug
 */

public class Book {
    private String bookName;
    private Integer price;

    public Book(String bookName, Integer price) {
        this.bookName = bookName;
        this.price = price;
    }

    public Book() {
    }

    public void myInit(){
        System.out.println("这是图书的初始化方法..");
    }
    public void myDestory(){
        System.out.println("这是图书的销毁方法..");
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", price=" + price +
                '}';
    }
}
