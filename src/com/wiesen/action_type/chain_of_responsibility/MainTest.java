package com.wiesen.action_type.chain_of_responsibility;

/**
 * Created by wiesen on 16-7-20.
 */
public class MainTest {

    public static void main(String[] args){
        ConcreteHandler concreteHandlerA = new ConcreteHandler();
        concreteHandlerA.handlerRequest();
        System.out.println("***************************");
        ConcreteHandler concreteHandlerB = new ConcreteHandler();
        concreteHandlerA.setHandler(concreteHandlerB);
        concreteHandlerA.handlerRequest();
    }
}
