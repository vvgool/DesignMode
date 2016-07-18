package com.wiesen.create_type.factory.factory;

/**
 * Created by wiesen on 16-7-18.
 */
public interface Operate<T> {
    T getResult(T a,T b) throws Exception;
}
