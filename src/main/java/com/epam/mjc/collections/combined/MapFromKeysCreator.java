package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();
        Set<String> set = sourceMap.keySet();

        for (String str : set) {
            Integer key = str.length();
            Set<String> buff;

            if (map.containsKey(key)) buff = map.get(key);
            else buff = new HashSet<>();

            buff.add(str);
            map.put(key, buff);
        }

        return map;
    }
}
