package com.wiesen.action_type.template;

/**
 * Created by wiesen on 16-7-20.
 */
public abstract class AbsTemplate {

    public void draw(){
        drawColor();
        drawShape();
    }

    public abstract void drawColor();

    public abstract void drawShape();
}
