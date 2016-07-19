package com.wiesen.structure_type.bridge;

/**
 * Created by wiesen on 16-7-19.
 */
public class AoDi extends AbsCar {
    @Override
    protected void drivingCar() {
        System.out.println("我正开着奥迪.");
        if (mStreet != null){
            mStreet.runningOn();
        }
    }
}
