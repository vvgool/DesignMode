package com.wiesen.action_type.command;

/**
 * Created by wiesen on 16-7-20.
 */
public class ConcreteCommandCancel implements ICommand {
    private Receiver mReceiver;

    public ConcreteCommandCancel(Receiver mReceiver) {
        this.mReceiver = mReceiver;
    }

    @Override
    public void execute() {
        mReceiver.cancelAction();
    }
}
