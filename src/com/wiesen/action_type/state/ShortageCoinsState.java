package com.wiesen.action_type.state;

/**
 * Created by wiesen on 16-7-20.
 */
public class ShortageCoinsState implements IState {
    @Override
    public void playGame() {
        System.out.println("硬币不够，请投入足够的硬币！");
    }
}
