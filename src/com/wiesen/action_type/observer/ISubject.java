package com.wiesen.action_type.observer;

/**
 * Created by wiesen on 16-7-20.
 */
public interface ISubject {
    void registerObserver(IObserver subject);

    void unRegisterObserver(IObserver subject);

    void onNotifyObserver();
}
