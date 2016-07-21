package com.wiesen.action_type.state;

/**
 * Created by wiesen on 16-7-20.
 */
public class Context {
    private int mCoinsNum;

    public Context(int mCoinsNum) {
        this.mCoinsNum = mCoinsNum;
    }

    public void playGame(){
        if (mCoinsNum==0){
            new NoCoinsState().playGame();
        }else if (mCoinsNum>0&&mCoinsNum<2){
            new ShortageCoinsState().playGame();
        }else {
            new InsertCoinsState().playGame();
        }
    }
}
