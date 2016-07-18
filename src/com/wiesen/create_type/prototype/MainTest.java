package com.wiesen.create_type.prototype;

/**
 * Created by wiesen on 16-7-18.
 */
public class MainTest{
    /**
     *根据网上找的一些资料说对列表是需要进行深拷贝，但是在实际操作中发现不需要对其进行独立的clone，只需要(Prototype)super.clone()
     * 就可以同步
     *拷贝列表中数据
     * @param args
     */
    public static void main(String[] args){
        Prototype prototype = new Prototype();
        prototype.addList("one to four");
        prototype.setName("wiesen");
        prototype.showInfo();
        System.out.println("---------------------------------------");
        try {
            Prototype prototype1 = prototype.clone1();
            prototype1.showInfo();
            System.out.println("----------------------------------");
            Prototype prototype2 = prototype.clone2();
            prototype2.showInfo();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
