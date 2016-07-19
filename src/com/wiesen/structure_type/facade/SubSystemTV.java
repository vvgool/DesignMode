package com.wiesen.structure_type.facade;

/**
 * Created by wiesen on 16-7-19.
 */
public class SubSystemTV implements ISubStatus {
    @Override
    public void turnOn() {
        System.out.println("打开电视机");
    }

    @Override
    public void turnOff() {
        System.out.println("关闭电视机");
    }
}
