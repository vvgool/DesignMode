package com.wiesen.action_type.state;

/**
 * Created by wiesen on 16-7-20.
 */
public class InsertCoinsState implements IState {
    @Override
    public void playGame() {
        System.out.println("已经投币，可以开始玩游戏了");
    }
}
