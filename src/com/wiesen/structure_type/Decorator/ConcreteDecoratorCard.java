package com.wiesen.structure_type.Decorator;

/**
 * Created by wiesen on 16-7-19.
 */
public class ConcreteDecoratorCard extends Decorator {

    public ConcreteDecoratorCard(Component component) {
        super(component);
    }

    public void onDecoratorCard(){
        System.out.println("I decorator card");
    }
}
