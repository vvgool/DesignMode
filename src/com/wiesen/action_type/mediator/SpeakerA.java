package com.wiesen.action_type.mediator;

/**
 * Created by wiesen on 16-7-21.
 */
public class SpeakerA extends AbsColleague {
    public SpeakerA(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void talk(String msg) {
        mMediator.talk(this,msg);
    }

    @Override
    public void receiveMsg(String name,String msg) {
        System.out.println("SpeakerA收到了来自"+name +"的消息："+msg);
    }
}
