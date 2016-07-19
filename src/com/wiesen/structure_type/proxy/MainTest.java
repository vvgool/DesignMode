package com.wiesen.structure_type.proxy;

/**
 * Created by wiesen on 16-7-19.
 */
public class MainTest {
    /**
     * 客户买东西找到了代理，通过代理买到了东西
     * @param args
     */
    public static void main(String[] args){
        RealSubject realSubject = new RealSubject();
        Proxy proxy = new Proxy(realSubject);
        proxy.buySomeClothes();
    }
}
