package com.wiesen.action_type.strategy;

/**
 * Created by wiesen on 16-7-20.
 */
public class TavelByTrain implements IStrategy {
    @Override
    public void travelByTheWay() {
        System.out.println("旅游的交通工具是火车");
    }
}
