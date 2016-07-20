package com.wiesen.action_type.chain_of_responsibility;

/**
 * Created by wiesen on 16-7-20.
 */
public abstract class IHandler {
    private IHandler mHandler;

    public void setHandler(IHandler handler){
        mHandler = handler;
    }

    public IHandler getHandler(){
        return mHandler;
    }

    public abstract void handlerRequest();
}
