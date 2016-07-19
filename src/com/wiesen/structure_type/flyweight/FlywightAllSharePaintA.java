package com.wiesen.structure_type.flyweight;

/**
 * Created by wiesen on 16-7-19.
 */
public class FlywightAllSharePaintA implements IFlywightAllShare {
    private String mPaintColor = "red";
    private int mPaintSize = 12;

    @Override
    public void onDisplay() {
        System.out.println("画笔颜色："+mPaintColor + "画笔大小："+mPaintSize);
    }
}
