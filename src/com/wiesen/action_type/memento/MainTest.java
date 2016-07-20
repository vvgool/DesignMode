package com.wiesen.action_type.memento;

/**
 * Created by wiesen on 16-7-20.
 */
public class MainTest {

    public static void main(String[] args){
        Originator originator = new Originator();
        originator.setStatus("状态1");
        System.out.println("未保存之前的状态："+originator.getStatus());
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        originator.setStatus("状态2");
        System.out.println("保存后改变的状态："+originator.getStatus());
        originator.setMemento(caretaker.getMemento());
        System.out.println("恢复后的状态:"+originator.getStatus());
    }
}
