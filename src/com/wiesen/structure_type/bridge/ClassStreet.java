package com.wiesen.structure_type.bridge;

/**
 * Created by wiesen on 16-7-19.
 */
public class ClassStreet extends AbsStreet {
    @Override
    protected void runningOn() {
        System.out.println("行走在乡间路上");
    }
}
