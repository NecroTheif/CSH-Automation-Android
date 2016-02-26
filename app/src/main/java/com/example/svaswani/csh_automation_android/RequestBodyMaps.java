package com.example.svaswani.csh_automation_android;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/**
 * Created by svaswani on 2/25/2016.
 */
public class RequestBodyMaps {

    public static String token = "E94NE43NMIIXXVVO2YST";
    public static Map<String, Object> tokenMap = ImmutableMap.of("id", (Object) token);
    public static Map<String, Object> tokenRequestMap = ImmutableMap.of("token", (Object) tokenMap);
    public static Map<String, Object> powerMap(boolean state){
        return ImmutableMap.of("power", ImmutableMap.of("state", (Object)state), "token", (Object)tokenMap);
    }

    public static RequestBody getRequestBody(Map<String, Object> fields){
        return  RequestBody.create(MediaType.parse("application/json; charset=utf-8"), getJSON(fields));
    }

    public static String getJSON(Map<String, Object> fields){

        String json = "{";
        for(Map.Entry<String, Object> field : fields.entrySet()){

            json += "\""+field.getKey()+"\":";

            if(field.getValue() instanceof Map)
                json += getJSON((Map<String, Object>) field.getValue());
            else if (field.getValue() instanceof String)
                json += "\""+field.getValue()+"\"";
            else
                json += field.getValue();
            json += ",";

        }
        json = json.substring(0, json.length()-1)+"}";
        return json;

    }
}
