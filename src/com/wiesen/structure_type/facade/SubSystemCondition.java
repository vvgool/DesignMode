package com.wiesen.structure_type.facade;

/**
 * Created by wiesen on 16-7-19.
 */
public class SubSystemCondition implements ISubStatus{


    @Override
    public void turnOn() {
        System.out.println("空调打开");
    }

    @Override
    public void turnOff() {
        System.out.println("空调关闭");
    }
}
