package com.wiesen.action_type.observer;

/**
 * Created by wiesen on 16-7-20.
 */
public class ConcreteObserverA implements IObserver {
    @Override
    public void onUpdate() {
        System.out.println("通知了ObserverA");
    }
}
