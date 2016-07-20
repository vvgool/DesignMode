package com.wiesen.action_type.iterator;

/**
 * Created by wiesen on 16-7-20.
 */
public class ConcreteIterator implements Iterator<String> {
    private String[] list = {"A","B","C","D","E","F"};
    private int current =0;

    @Override
    public String first() {
        current = 0;
        return list[0];
    }

    @Override
    public String next() {
        if (haveNext()) {
            return list[current++];
        }
        return null;
    }

    @Override
    public String currentItem() {
        return list[current];
    }

    @Override
    public boolean haveNext() {
        return current<list.length;
    }
}
