package com.wiesen.action_type.iterator;

/**
 * Created by wiesen on 16-7-20.
 */
public class ConcreteAggregate implements IAggregate {
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator();
    }
}
