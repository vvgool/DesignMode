package com.wiesen.structure_type.Decorator;

/**
 * Created by wiesen on 16-7-19.
 */
public class ConcreteComponent implements Component {
    /**
     * 被装饰的物品，所有的装饰都是围绕它来进行的，
     */
    @Override
    public void onDecoratorWindow() {
        System.out.println("this is black window");
    }
}
