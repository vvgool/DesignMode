package com.wiesen.action_type.memento;

/**
 * Created by wiesen on 16-7-20.
 */
public class Originator {
    private String mStatus;

    public void setMemento(Memento memento){
        mStatus = memento.getStatus();
    }

    public Memento createMemento(){
        return new Memento(mStatus);
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String mStatus) {
        this.mStatus = mStatus;
    }
}
