package com.jiang.servlet;

import com.jiang.dao.BookDao;
import com.jiang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


/**
 * @Title:
 * @author: JiangPeng
 * @Code: No Bug
 */
@Controller
public class BookServlet {

    @Autowired
    private BookService bookService;

    public void saveBook(){
        System.out.println("servlet用户正在保存图书..");
        bookService.saveBook();
    }

    /*
        当方法上有@Autowired注解时
        1. 这个方法会在bean创建的时候自动运行
        2. 这个方法上的每一个参数都会自动注入值

     */
    @Autowired
    public void autoDemo(BookDao bookDao){
        System.out.println("autowired注解的方法");
    }

}
