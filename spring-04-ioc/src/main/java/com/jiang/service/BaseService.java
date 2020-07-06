package com.jiang.service;

import com.jiang.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Title:
 * @author: JiangPeng
 * @Code: No Bug
 */
public class BaseService<T> {

    @Autowired
    BaseDao<T> baseDao;

    public void save(){
        baseDao.save();
    }

}
