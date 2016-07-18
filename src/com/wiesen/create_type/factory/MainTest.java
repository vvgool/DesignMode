package com.wiesen.create_type.factory;

import com.wiesen.create_type.factory.abstract_factory.AddFactory;
import com.wiesen.create_type.factory.factory.BaseOperate;
import com.wiesen.create_type.factory.factory.OperateFactory;

/**
 * Created by wiesen on 16-7-18.
 */
public class MainTest {

    public static void main(String[] args){
        try {
            BaseOperate baseOperate = OperateFactory.createOperation(OperateFactory.OperateType.DIV);
            BaseOperate baseOperate1 = new AddFactory().product();
            int result= (int) baseOperate1.getResult(11,12);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
