package com.wiesen.structure_type.adapter;

/**
 * Created by wiesen on 16-7-18.
 */
public class Adaptee {

    public void onSpecificRequest(){
        System.out.println("可复用，但是接口不匹配，需要进行适配接口");
    }
}
