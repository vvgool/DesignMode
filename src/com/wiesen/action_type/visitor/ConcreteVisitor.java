package com.wiesen.action_type.visitor;

/**
 * Created by wiesen on 16-7-21.
 */
public class ConcreteVisitor implements IVisitor {
    @Override
    public void visit(Book book) {
        System.out.println("book name:"+book.getmBookName()+"\t book price:"+book.getmBookPrice());
    }

    @Override
    public void visit(Paint paint) {
        System.out.println("paint name:"+paint.getmPaintName()+"\t paint price:" +paint.getmPaintPrice());
    }
}
