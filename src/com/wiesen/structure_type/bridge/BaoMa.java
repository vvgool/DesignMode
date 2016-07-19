package com.wiesen.structure_type.bridge;

/**
 * Created by wiesen on 16-7-19.
 */
public class BaoMa extends AbsCar {

    @Override
    protected void drivingCar() {
        System.out.println("我正开着宝马.");
        if (mStreet != null){
            mStreet.runningOn();
        }
    }
}
