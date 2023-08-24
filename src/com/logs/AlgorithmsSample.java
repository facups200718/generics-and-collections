package com.logs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class AlgorithmsSample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(150);
        arrayList.add(200);
        arrayList.add(80);

        System.out.println("Orden original");
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Collections.sort(arrayList);
        System.out.println("Ordenados de menor a mayor");
        Iterator<Integer> integerIterator = arrayList.iterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }

        Collections.shuffle(arrayList);
        System.out.println("Desordenados");
        Iterator<Integer> integerIterator1 = arrayList.iterator();
        while (integerIterator1.hasNext()) {
            System.out.println(integerIterator1.next());
        }
    }
}
