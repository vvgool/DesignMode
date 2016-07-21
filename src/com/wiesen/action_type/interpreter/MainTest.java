package com.wiesen.action_type.interpreter;

/**
 * Created by wiesen on 16-7-21.
 */
public class MainTest {

    public static void main(String[] args){
        Context context = new Context(4,3);
        AddInterpreter addInterpreter = new AddInterpreter();
        System.out.println(addInterpreter.interpreter(context));
        System.out.println("**************************");
        SubInterpreter subInterpreter = new SubInterpreter();
        System.out.println(subInterpreter.interpreter(context));
    }
}
