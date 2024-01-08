package com.epam.mjc.collections.combined;

import java.util.*;
import java.util.stream.Collector;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> list = new ArrayList<>();
        Set<Map.Entry<String, Set<String>>> entrySet = projects.entrySet();

        for (Map.Entry<String, Set<String>> entry : entrySet) {
            Set<String> set = entry.getValue();
            if (set.contains(developer)) {
                list.add(entry.getKey());
            }
        }

        list.sort(new StringComparator());
        return list;
    }
}

class StringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() == o2.length()) {
            return o2.compareTo(o1);
        } else {
            return o2.length() - o1.length();
        }
    }
}
