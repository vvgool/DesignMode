package com.wiesen.create_type.factory.abstract_factory;

import com.wiesen.create_type.factory.factory.BaseOperate;
import com.wiesen.create_type.factory.factory.MulOperate;

/**
 * Created by wiesen on 16-7-18.
 */
public class MulFactory implements Factory {
    @Override
    public BaseOperate product() {
        return new MulOperate();
    }
}
