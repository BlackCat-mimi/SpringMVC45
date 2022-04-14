package com.moran.controller.c_param;

import java.util.Map;

public class Tools {
    public static Object map2Objext(Map<String, String[]> parameterMap, Class<?> userClass) {

        for(Map.Entry<String,String[]> entry : parameterMap.entrySet()){
            String key = entry.getKey();
            String[] value = entry.getValue();
        }
        return null;
    }
}
