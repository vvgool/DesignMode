package com.wiesen.structure_type.Decorator;

/**
 * Created by wiesen on 16-7-19.
 */
public class ConcreteDecoratorFlower extends Decorator {

    public ConcreteDecoratorFlower(Component component) {
        super(component);
    }

    public void onDecoratorFlower(){
        System.out.println("I decorator red flower");
    }
}
