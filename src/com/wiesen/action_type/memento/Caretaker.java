package com.wiesen.action_type.memento;

/**
 * Created by wiesen on 16-7-20.
 */
public class Caretaker {
    /**
     * 存储空间，保存备忘录
     */

    private Memento mMemento;

    public Memento getMemento() {
        return mMemento;
    }

    public void setMemento(Memento mMemento) {
        this.mMemento = mMemento;
    }
}
