package com.logs;

import java.util.*;

public class GenericWildCards {
    public static void main(String[] args) {
        var itemsList = new ArrayList<String>();
        itemsList.add("Item 1");
        itemsList.add("Item 2");
        viewData(itemsList);

        var integerList = new ArrayList<Integer>();
        addOneHundredIntegerElement(integerList);
        viewData(integerList);
    }

    public static void viewData(List<?> itemsList) {
        for (Object item : itemsList) {
            System.out.println(item);
        }
    }

    public static void addOneHundredIntegerElement(List<? super Integer> integerList) {
        integerList.add(100);
    }
}
