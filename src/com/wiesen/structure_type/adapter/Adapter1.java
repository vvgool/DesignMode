package com.wiesen.structure_type.adapter;

/**
 * Created by wiesen on 16-7-18.
 */
public class Adapter1 implements ITarget {
    Adaptee adaptee = new Adaptee();
    @Override
    public void onRequest() {
        adaptee.onSpecificRequest();
    }
}
