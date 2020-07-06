package com.jiang.impl;

import com.jiang.inter.Calculator;
import com.jiang.utils.LogUtil;

/**
 * @Title:
 * @author: JiangPeng
 * @Code: No Bug
 */
public class MyCalculator implements Calculator {

    public int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public int del(int a, int b) {
        int result = a - b;
        return result;
    }

    public int mul(int a, int b) {
        int result = a * b;
        return result;
    }

    public int div(int a, int b) {
        int result = a / b;
        return result;
    }
}