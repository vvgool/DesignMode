package com.wiesen.structure_type.adapter;

/**
 * Created by wiesen on 16-7-18.
 */
public class Adapter2 extends Adaptee implements ITarget {
    @Override
    public void onRequest() {
        super.onSpecificRequest();
    }
}
