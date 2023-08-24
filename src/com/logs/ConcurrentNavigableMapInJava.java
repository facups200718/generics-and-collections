package com.logs;

import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentNavigableMapInJava {
    public static void main(String[] args) {
        ConcurrentNavigableMap<Integer, String> concurrentNavigableMap = new ConcurrentSkipListMap<>();
        concurrentNavigableMap.put(1, "Data1");
        concurrentNavigableMap.put(2, "Data2");
        concurrentNavigableMap.put(3, "Data3");
        concurrentNavigableMap.put(4, "Data4");
        // Se queda con la cola
        ConcurrentNavigableMap<Integer, String> tailMap = concurrentNavigableMap.tailMap(2);
        System.out.println(tailMap);

        // Se queda con la capocha
        ConcurrentNavigableMap<Integer, String> headMap = concurrentNavigableMap.headMap(3);
        System.out.println(headMap);
    }
}
