package com.wiesen.action_type.mediator;

/**
 * Created by wiesen on 16-7-21.
 */
public abstract class AbsColleague {
    protected IMediator mMediator;
    private String mName;

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public AbsColleague(IMediator mediator) {
        mMediator = mediator;
    }

    public abstract void talk(String msg);

    public abstract void receiveMsg(String name,String msg);
}
