package com.wiesen.action_type.visitor;

/**
 * Created by wiesen on 16-7-21.
 */
public class Book implements IGoodsAccept {

    private String mBookName;
    private int mBookPrice;

    public Book(String mBookName, int mBookPrice) {
        this.mBookName = mBookName;
        this.mBookPrice = mBookPrice;
    }

    public String getmBookName() {
        return mBookName;
    }

    public int getmBookPrice() {
        return mBookPrice;
    }

    @Override
    public void acceptVisitor(IVisitor visitor) {
        visitor.visit(this);
    }
}
