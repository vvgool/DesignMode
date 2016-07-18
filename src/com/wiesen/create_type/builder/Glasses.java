package com.wiesen.create_type.builder;

/**
 * Created by wiesen on 16-7-18.
 * 产物：眼镜
 */
public class Glasses {
    //镜框
    private String mPictureFrame;
    //镜片
    private String mEyeGlass;

    public String getPictureFrame() {
        return mPictureFrame;
    }

    public void setPictureFrame(String pictureFrame) {
        this.mPictureFrame = pictureFrame;
    }

    public String getEyeGlass() {
        return mEyeGlass;
    }

    public void setEyeGlass(String eyeGlass) {
        this.mEyeGlass = eyeGlass;
    }

    @Override
    public String toString() {
        return "镜框："+mPictureFrame +"\n"+"镜片:"+mEyeGlass;
    }
}
