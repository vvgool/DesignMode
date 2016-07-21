package com.wiesen.action_type.interpreter;

/**
 * Created by wiesen on 16-7-21.
 */
public class Context {
    private int mNum1;
    private int mNum2;

    public int getNum2() {
        return mNum2;
    }

    public void setNum2(int num2) {
        this.mNum2 = num2;
    }

    public int getNum1() {
        return mNum1;
    }

    public void setNum1(int num1) {
        this.mNum1 = num1;
    }

    public Context(int num1, int num2) {

        this.mNum1 = num1;

        this.mNum2 = num2;
    }
}
