package com.jiang.dao;

import com.jiang.bean.User;
import org.springframework.stereotype.Repository;

/**
 * @Title:
 * @author: JiangPeng
 * @Code: No Bug
 */

@Repository
public class UserDao extends BaseDao<User> {
    public void save() {
        System.out.println("UserDao保存用户...");
    }
}
