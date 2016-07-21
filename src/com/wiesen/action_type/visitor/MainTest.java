package com.wiesen.action_type.visitor;

/**
 * Created by wiesen on 16-7-21.
 */
public class MainTest {

    public static void main(String[] args){
        ConcreteVisitor concreteVisitor = new ConcreteVisitor();

        Book book = new Book("java design",50);
        Paint paint = new Paint("pen",15);

        book.acceptVisitor(concreteVisitor);
        System.out.println("************************");
        paint.acceptVisitor(concreteVisitor);


    }
}
