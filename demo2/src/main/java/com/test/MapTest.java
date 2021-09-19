package com.test;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapTest {
    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(5);
        linkedHashMap.put("1", "hello");
        linkedHashMap.put("2", "hello");
        linkedHashMap.put("3", "hello");
        linkedHashMap.remove("1");
        linkedHashMap.put("1",linkedHashMap.get("1"));
//        linkedHashMap.put("1", "yes");
        linkedHashMap.put("2", "yes");
        linkedHashMap.put("3", "no");
        System.out.println(linkedHashMap);
    }
}
