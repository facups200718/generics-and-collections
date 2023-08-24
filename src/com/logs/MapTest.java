package com.logs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put(1, "Alex");
        map.put(3, "Alan");
        map.put(7, "Cody");
        map.put(8, "Dana");

        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
