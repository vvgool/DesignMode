package com.wiesen.action_type.iterator;

/**
 * Created by wiesen on 16-7-20.
 */
public class MainTest {

    public static void main(String[] args){
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        Iterator iterator = concreteAggregate.createIterator();
        while (iterator.haveNext()){
            System.out.println(iterator.next());
        }
    }
}
