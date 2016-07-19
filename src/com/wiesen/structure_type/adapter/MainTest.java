package com.wiesen.structure_type.adapter;

/**
 * Created by wiesen on 16-7-18.
 */
public class MainTest {


    public static void main(String[] args){
        Adapter1 adapter1 = new Adapter1();
        adapter1.onRequest();
        System.out.println("------------------");
        Adapter2 adapter2 = new Adapter2();
        adapter2.onRequest();
    }
}
