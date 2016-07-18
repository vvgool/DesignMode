package com.wiesen.create_type.builder;

/**
 * Created by wiesen on 16-7-18.
 */
public class MainTest {
    public static void main(String[] args){
        Builder builder = new ConcreteBuilder();
        Director director = new Director();
        director.buildProduct(builder);
        String product=builder.getResult().toString();
        System.out.println(product);
    }
}
