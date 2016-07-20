package com.wiesen.action_type.strategy;

/**
 * Created by wiesen on 16-7-20.
 */
public class MainTest {

    public static void main(String[] args){
        IStrategy strategy = new TravelByPlane();
        Context context = new Context(strategy);
        context.goToTravel();
    }
}
