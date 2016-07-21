package com.wiesen.action_type.interpreter;

/**
 * Created by wiesen on 16-7-21.
 */
public class AddInterpreter implements Interpreter {
    @Override
    public int interpreter(Context context) {
        return context.getNum1()+context.getNum2();
    }
}
