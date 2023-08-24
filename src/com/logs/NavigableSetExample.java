package com.logs;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {
    public static void main(String[] args) {
        NavigableSet<String> navigableSet = new TreeSet<>();
        navigableSet.add("a");
        navigableSet.add("c");
        navigableSet.add("b");
        System.out.println("Normal view");
        System.out.println(navigableSet);
        System.out.println("Reversed view");
        System.out.println(navigableSet.descendingSet());

    }
}
