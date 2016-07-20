package com.wiesen.action_type.strategy;

/**
 * Created by wiesen on 16-7-20.
 */
public class Context {
    private IStrategy mStrategy;

    public Context(IStrategy strategy) {
        this.mStrategy = strategy;
    }

    public void goToTravel(){
        if (mStrategy!=null){
            mStrategy.travelByTheWay();
        }
    }
}
