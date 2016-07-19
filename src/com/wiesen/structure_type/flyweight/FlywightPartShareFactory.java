package com.wiesen.structure_type.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wiesen on 16-7-19.
 */
public class FlywightPartShareFactory {
    private Map<String,IFlywightPartShare> partShareMap = new HashMap<String,IFlywightPartShare>();

    public IFlywightPartShare getPartShare(String key){
        if (partShareMap.containsKey(key)){
            return partShareMap.get(key);
        }else {
            IFlywightPartShare partShare = new FlywightPartSharePaintA();
            partShareMap.put("part_share",partShare);
            return partShare;
        }
    }
}
