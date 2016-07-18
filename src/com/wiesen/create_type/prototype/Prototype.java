package com.wiesen.create_type.prototype;

import java.util.ArrayList;

/**
 * Created by wiesen on 16-7-18.
 */
public class Prototype implements Cloneable {
    private String mName ;
    /**
     * Object类的clone方法只会拷贝对象中的基本的数据类型，对于数组、容器对象、引用对象等都不会拷贝，这就是浅拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    public Prototype clone1() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }

    /**
     * 如果要实现深拷贝，必须将原型模式中的数组、容器对象、引用对象等另行拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    private ArrayList<String> mArrayList = new ArrayList<String>();
    public Prototype clone2() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        prototype.mArrayList = (ArrayList<String>) this.mArrayList.clone();
        return prototype;
    }

    public void addList(String str){
        mArrayList.add(str);
    }

    public void setName(String name){
        mName = name;
    }

    public void showInfo(){
        System.out.println("name:"+mName);
        for (String str:mArrayList){
            System.out.println(str);
        }
    }
}
