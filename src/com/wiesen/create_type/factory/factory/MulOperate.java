package com.wiesen.create_type.factory.factory;

/**
 * Created by wiesen on 16-7-18.
 */
public class MulOperate extends BaseOperate<Integer> {
    @Override
    public Integer getResult(Integer a, Integer b)throws Exception {
        return a*b;
    }
}
