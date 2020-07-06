package com.jiang.bean;/*
 *
 * @author JiangPeng
 * @My code no bug
 */

public class AirPlan {

    private String fdj;//发动机
    private Integer yc;//机翼长度
    private Integer personNum;//载客人数
    private String jzName;//机长
    private String fjsName;//副驾驶

    @Override
    public String toString() {
        return "AirPlan{" +
                "fdj='" + fdj + '\'' +
                ", yc='" + yc + '\'' +
                ", personNum=" + personNum +
                ", jzName='" + jzName + '\'' +
                ", fjsName='" + fjsName + '\'' +
                '}';
    }

    public String getFdj() {
        return fdj;
    }

    public void setFdj(String fdj) {
        this.fdj = fdj;
    }

    public Integer getYc() {
        return yc;
    }

    public void setYc(Integer yc) {
        this.yc = yc;
    }

    public Integer getPersonNum() {
        return personNum;
    }

    public void setPersonNum(Integer personNum) {
        this.personNum = personNum;
    }

    public String getJzName() {
        return jzName;
    }

    public void setJzName(String jzName) {
        this.jzName = jzName;
    }

    public String getFjsName() {
        return fjsName;
    }

    public void setFjsName(String fjsName) {
        this.fjsName = fjsName;
    }
}
