package com.jiang.service;

import com.jiang.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Title:
 * @author: JiangPeng
 * @Code: No Bug
 */

@Service
public class BookService {

    @Autowired(required = false)
    private BookDao bookDao;

    public void saveBook(){
        System.out.println("service正在通过dao层保存图书，经过service进行验证处理....");
        bookDao.saveBook();
    }
}
