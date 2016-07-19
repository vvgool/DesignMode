package com.wiesen.structure_type.flyweight;

/**
 * Created by wiesen on 16-7-19.
 */
public class FlywightPartSharePaintA implements IFlywightPartShare {
    private String mPaintColor = "black";

    private int mPaintSize;

    @Override
    public void onDisplay() {
        System.out.println("画笔颜色："+mPaintColor + "画笔大小："+mPaintSize);
    }

    @Override
    public void setFontSize(int size) {
        mPaintSize = size;
    }

}
