package com.wiesen.action_type.template;

/**
 * Created by wiesen on 16-7-20.
 */
public class RectangleTemplate extends AbsTemplate {
    @Override
    public void drawColor() {
        System.out.println("用蓝色");
    }

    @Override
    public void drawShape() {
        System.out.println("绘制矩形");
    }
}
