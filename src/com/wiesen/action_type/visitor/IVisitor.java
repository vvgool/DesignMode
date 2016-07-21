package com.wiesen.action_type.visitor;

/**
 * Created by wiesen on 16-7-21.
 */
public interface IVisitor {
    void visit(Book book);
    void visit(Paint paint);
}
