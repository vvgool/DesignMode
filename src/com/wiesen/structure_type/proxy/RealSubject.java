package com.wiesen.structure_type.proxy;

/**
 * Created by wiesen on 16-7-19.
 */
public class RealSubject implements Subject {
    @Override
    public void buySomeClothes() {
        System.out.println("代理通过一定的渠道买了一些衣服");
    }
}
