package com.wiesen.action_type.command;

/**
 * Created by wiesen on 16-7-20.
 */
public class MainTest {

    public static void main(String[] args){
        Invoker invoker = new Invoker();
        Receiver receiver = new Receiver();
        ICommand command = new ConcreteCommandAction(receiver);
        ICommand commandCancel = new ConcreteCommandCancel(receiver);
        invoker.setCommand(command);
        invoker.runOnCommand();

        System.out.println("********************");

        invoker.setCommand(commandCancel);
        invoker.runOnCommand();

    }
}
