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
