package com.wiesen.structure_type.bridge;

/**
 * Created by wiesen on 16-7-19.
 */
public abstract class AbsCar {
    protected AbsStreet mStreet;

    public AbsCar(){}

    public AbsCar(AbsStreet mStreet) {
        this.mStreet = mStreet;
    }

    public void setStreet(AbsStreet absStreet){
        mStreet = absStreet;
    }

    public AbsStreet getStreet(){
        return mStreet;
    }

    protected abstract void drivingCar();
}
