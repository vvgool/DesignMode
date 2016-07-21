package com.wiesen.action_type.mediator;

/**
 * Created by wiesen on 16-7-21.
 */
public class MainTest {

    public static void main(String[] args){
        ConcreteMediator concreteMediator = new ConcreteMediator();
        SpeakerA speakerA = new SpeakerA(concreteMediator);
        speakerA.setmName("speaker a");
        SpeakerB speakerB = new SpeakerB(concreteMediator);
        speakerB.setmName("speaker b");
        concreteMediator.registerTalking(speakerA);
        concreteMediator.registerTalking(speakerB);

        speakerA.talk("hello");

        speakerB.talk("nice to meet you");
    }
}
