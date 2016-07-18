package com.wiesen.create_type.builder;

/**
 * Created by wiesen on 16-7-18.
 */
public class Director {

    public void buildProduct(Builder concreteBuilder){
        concreteBuilder.buildPictureFrame();
        concreteBuilder.buildEyeGlass();
    }
}
