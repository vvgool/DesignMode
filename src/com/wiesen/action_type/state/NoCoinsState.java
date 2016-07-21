package com.wiesen.action_type.state;

/**
 * Created by wiesen on 16-7-20.
 */
public class NoCoinsState implements IState {
    @Override
    public void playGame() {
        System.out.println("未投币状态，请先投币");
    }
}
