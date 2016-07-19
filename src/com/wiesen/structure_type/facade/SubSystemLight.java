package com.wiesen.structure_type.facade;

/**
 * Created by wiesen on 16-7-19.
 */
public class SubSystemLight implements ISubStatus{

    @Override
    public void turnOn(){
        System.out.println("打开电灯");
    }

    @Override
    public void turnOff(){
        System.out.println("关闭电灯");
    }
}
