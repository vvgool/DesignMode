package com.wiesen.action_type.mediator;

import java.util.Vector;

/**
 * Created by wiesen on 16-7-21.
 */
public class ConcreteMediator implements IMediator {
    private Vector<AbsColleague> mColleague = new Vector<>();

    public void registerTalking(AbsColleague absColleague){
        mColleague.add(absColleague);
    }

    public void unRegisterTalking(AbsColleague absColleague){
        mColleague.remove(absColleague);
    }

    @Override
    public void talk(AbsColleague colleague, String msg) {
        for (AbsColleague colleagueItem:mColleague){
            if (colleague != colleagueItem){
                colleagueItem.receiveMsg(colleague.getmName(),msg);
            }
        }
    }
}
