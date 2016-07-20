package com.wiesen.action_type.memento;

/**
 * Created by wiesen on 16-7-20.
 */
public class Memento {
    private String mStatus;

    /**
     * 备忘录，保存状态信息
     * @param mStatus
     */
    public Memento(String mStatus) {
        this.mStatus = mStatus;
    }

    public void setStatus(String status){
        mStatus = status;
    }

    public String getStatus(){
        return mStatus;
    }
}
