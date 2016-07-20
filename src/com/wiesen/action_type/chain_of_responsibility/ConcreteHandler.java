package com.wiesen.action_type.chain_of_responsibility;

/**
 * Created by wiesen on 16-7-20.
 */
public class ConcreteHandler extends IHandler {
    @Override
    public void handlerRequest() {
        if (getHandler() != null){
            System.out.println("下一个责任人处理");
            getHandler().handlerRequest();
        }else {
            System.out.println("当前责任人进行处理");
        }
    }
}
