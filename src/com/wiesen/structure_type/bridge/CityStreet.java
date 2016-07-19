package com.wiesen.structure_type.bridge;

/**
 * Created by wiesen on 16-7-19.
 */
public class CityStreet extends AbsStreet {
    @Override
    protected void runningOn() {
        System.out.println("城市公路上.");
    }
}
