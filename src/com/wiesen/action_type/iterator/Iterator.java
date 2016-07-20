package com.wiesen.action_type.iterator;

/**
 * Created by wiesen on 16-7-20.
 */
public interface Iterator<T> {
    T first();
    T next();
    T currentItem();
    boolean haveNext();
}
