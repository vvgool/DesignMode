package com.wiesen.action_type.observer;

import java.util.Vector;

/**
 * Created by wiesen on 16-7-20.
 */
public class ConcreteSubject implements ISubject {
    private Vector<IObserver> mObserverList = new Vector<>();

    @Override
    public void registerObserver(IObserver subject) {
        mObserverList.add(subject);
    }

    @Override
    public void unRegisterObserver(IObserver subject) {
        mObserverList.remove(subject);
    }

    @Override
    public void onNotifyObserver() {
        for (IObserver observer:mObserverList){
            observer.onUpdate();
        }
    }
}
