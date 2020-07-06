package com.jiang.dao;

import com.jiang.bean.Book;
import org.springframework.stereotype.Repository;

/**
 * @Title:
 * @author: JiangPeng
 * @Code: No Bug
 */
@Repository
public class BookDao extends BaseDao<Book> {
    public void save() {
        System.out.println("BookDao保存图书....");
    }
}
