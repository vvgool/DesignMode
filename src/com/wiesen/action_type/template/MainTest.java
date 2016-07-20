package com.wiesen.action_type.template;

/**
 * Created by wiesen on 16-7-20.
 */
public class MainTest {

    public static void main(String[] args){
        CircleTemplate circleTemplate = new CircleTemplate();
        circleTemplate.draw();

        System.out.println("*********************************");

        RectangleTemplate rectangleTemplate = new RectangleTemplate();
        rectangleTemplate.draw();

    }
}
