package com.wiesen.action_type.observer;

/**
 * Created by wiesen on 16-7-20.
 */
public class MainTest {

    public static void main(String[] args){
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserverA concreteObserverA = new ConcreteObserverA();
        ConcreteObserverB concreteObserverB = new ConcreteObserverB();

        concreteSubject.registerObserver(concreteObserverA);
        concreteSubject.registerObserver(concreteObserverB);
        concreteSubject.onNotifyObserver();
        System.out.println("**********************************");
        concreteSubject.unRegisterObserver(concreteObserverA);
        concreteSubject.onNotifyObserver();
    }
}
