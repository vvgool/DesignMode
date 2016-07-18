package com.wiesen.create_type.factory.abstract_factory;

import com.wiesen.create_type.factory.factory.AddOperate;
import com.wiesen.create_type.factory.factory.BaseOperate;

/**
 * Created by wiesen on 16-7-18.
 */
public class AddFactory implements Factory {
    @Override
    public BaseOperate product() {
        return new AddOperate();
    }
}
