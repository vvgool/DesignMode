package com.wiesen.structure_type.flyweight;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by wiesen on 16-7-19.
 */
public class FlywightAllShareFactory {
    private Map<String,IFlywightAllShare> allShareMap = new HashMap<String,IFlywightAllShare>();

    public IFlywightAllShare getFlywight(String key){
        if (allShareMap.containsKey(key)){
            return allShareMap.get(key);
        }else {
            IFlywightAllShare flywightAllShare = new FlywightAllSharePaintA();
            allShareMap.put("all_share",flywightAllShare);
            return flywightAllShare;
        }
    }
}
