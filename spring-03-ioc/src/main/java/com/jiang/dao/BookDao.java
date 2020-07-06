package com.jiang.dao;

import org.springframework.stereotype.Repository;

/**
 * @Title:
 * @author: JiangPeng
 * @Code: No Bug
 */
@Repository
public class BookDao {

    public void saveBook(){
        System.out.println("dao正在连接数据库保存图书....");
    }

}
