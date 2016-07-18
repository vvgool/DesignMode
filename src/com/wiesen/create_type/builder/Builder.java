package com.wiesen.create_type.builder;

/**
 * Created by wiesen on 16-7-18.
 */
public abstract class Builder {
    protected abstract void buildPictureFrame();

    protected abstract void buildEyeGlass();

    protected abstract Glasses getResult();
}
