package com.wiesen.structure_type.facade;

/**
 * Created by wiesen on 16-7-19.
 */
public class Facade {


    private final SubSystemLight mSubSystemLight;
    private final SubSystemCondition mSubSystemCondition;
    private final SubSystemTV mSubSystemTV;

    /**
     * 外观模式就是将各个不相干的类，统一起来进行综合使用
     * 比方说：对家电的统一管理
     * 或者说对解偶后的模块，达到各个模块之间的协同工作
     * 比方说：加密一个文件（获取文件流-->加密-->写出文件流）
     */
    public Facade() {
        mSubSystemLight = new SubSystemLight();
        mSubSystemCondition = new SubSystemCondition();
        mSubSystemTV = new SubSystemTV();
    }

    public void powerOn(){
        mSubSystemCondition.turnOn();
        mSubSystemLight.turnOn();
        mSubSystemTV.turnOn();
    }

    public void powerOff(){
        mSubSystemCondition.turnOff();
        mSubSystemLight.turnOff();
        mSubSystemTV.turnOff();
    }
}
