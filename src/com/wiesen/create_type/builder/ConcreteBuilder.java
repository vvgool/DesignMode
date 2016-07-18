package com.wiesen.create_type.builder;

/**
 * Created by wiesen on 16-7-18.
 */
public class ConcreteBuilder extends Builder {
    private Glasses mGlasses;

    public ConcreteBuilder() {
        mGlasses = new Glasses();
    }

    @Override
    protected void buildPictureFrame() {
        mGlasses.setPictureFrame("树脂镜框");
    }

    @Override
    protected void buildEyeGlass() {
        mGlasses.setEyeGlass("100度镜片");
    }

    @Override
    protected Glasses getResult(){
        return mGlasses;
    }
}
