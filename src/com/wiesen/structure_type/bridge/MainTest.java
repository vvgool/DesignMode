package com.wiesen.structure_type.bridge;

/**
 * Created by wiesen on 16-7-19.
 */
public class MainTest {

    public static void main(String[] args){
        AbsCar car = new BaoMa();
        AbsStreet street = new ClassStreet();
        car.setStreet(street);
        car.drivingCar();
    }
}
