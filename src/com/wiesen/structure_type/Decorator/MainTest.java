package com.wiesen.structure_type.Decorator;

/**
 * Created by wiesen on 16-7-19.
 */
public class MainTest {

    public static void main(String[] args){
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorFlower concreteDecoratorFlower = new ConcreteDecoratorFlower(concreteComponent);
        concreteDecoratorFlower.onDecoratorWindow();
        concreteDecoratorFlower.onDecoratorFlower();

        System.out.println("*********************************");

        ConcreteDecoratorCard concreteDecoratorCard  = new ConcreteDecoratorCard(concreteComponent);
        concreteDecoratorCard.onDecoratorWindow();
        concreteDecoratorCard.onDecoratorCard();
    }
}
