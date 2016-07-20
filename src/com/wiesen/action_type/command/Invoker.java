package com.wiesen.action_type.command;

/**
 * Created by wiesen on 16-7-20.
 */
public class Invoker {
    private ICommand mCommand;

    public void setCommand(ICommand command){
        mCommand = command;
    }

    public void runOnCommand(){
        if (mCommand!= null){
            mCommand.execute();
        }
    }
}
