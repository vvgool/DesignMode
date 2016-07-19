package com.wiesen.structure_type.proxy;

/**
 * Created by wiesen on 16-7-19.
 */
public class Proxy implements Subject {
    private Subject mSubject;


    /**
     * 客户想买一些衣服，但是找不到衣服生产厂商，
     * 所以需要使用代理进行购买
     * @param subject
     */
    public Proxy(Subject subject) {
        mSubject = subject;
    }

    @Override
    public void buySomeClothes() {
        mSubject.buySomeClothes();
    }
}
