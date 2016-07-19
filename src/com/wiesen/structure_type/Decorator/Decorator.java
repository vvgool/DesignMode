package com.wiesen.structure_type.Decorator;

/**
 * Created by wiesen on 16-7-19.
 */
public class Decorator implements Component {
    private Component mConponent;

    public Decorator(Component component) {
        mConponent = component;
    }

    @Override
    public void onDecoratorWindow() {
        mConponent.onDecoratorWindow();
    }
}
