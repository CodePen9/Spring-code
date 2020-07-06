package com.jiang.inter;

import org.springframework.stereotype.Component;

/**
 * @Title:
 * @author: JiangPeng
 * @Code: No Bug
 */

public interface Calculator {
    public int add(int a, int b);
    public int del(int a, int b);
    public int mul(int a, int b);
    public int div(int a, int b);
}
