package com.wiesen.create_type.factory.abstract_factory;

import com.wiesen.create_type.factory.factory.BaseOperate;
import com.wiesen.create_type.factory.factory.DivOperate;

/**
 * Created by wiesen on 16-7-18.
 */
public class DivFactory implements Factory {
    @Override
    public BaseOperate product() {
        return new DivOperate();
    }
}
