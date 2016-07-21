package com.wiesen.action_type.visitor;

/**
 * Created by wiesen on 16-7-21.
 */
public class Paint implements IGoodsAccept {
    private String mPaintName;
    private int mPaintPrice;

    public Paint(String mPaintName, int mPaintPrice) {
        this.mPaintName = mPaintName;
        this.mPaintPrice = mPaintPrice;
    }

    public String getmPaintName() {
        return mPaintName;
    }

    public int getmPaintPrice() {
        return mPaintPrice;
    }

    @Override
    public void acceptVisitor(IVisitor visitor) {
        visitor.visit(this);
    }
}
