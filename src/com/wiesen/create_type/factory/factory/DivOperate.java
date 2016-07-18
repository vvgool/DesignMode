package com.wiesen.create_type.factory.factory;

/**
 * Created by wiesen on 16-7-18.
 */
public class DivOperate extends BaseOperate<Integer> {
    @Override
    public Integer getResult(Integer a, Integer b) throws Exception{
        if (b == 0){
            throw new Exception("the dived not be zero");
        }
        return a/b;
    }
}
