package com.jiang.factory;/*
 *
 * @author JiangPeng
 * @My code no bug
 */

import com.jiang.bean.AirPlan;

//静态工厂
public class AirPlanStaticFactory {

    public static AirPlan getAirPlan(String jzName){
        System.out.println("AirPlanStaticFactory...静态工厂正在造飞机");
        AirPlan airPlan = new AirPlan();
        airPlan.setFdj("发动机");
        airPlan.setJzName(jzName);
        airPlan.setPersonNum(300);
        airPlan.setYc(50);
        airPlan.setFjsName("副驾驶01");
        return airPlan;
    }
}
