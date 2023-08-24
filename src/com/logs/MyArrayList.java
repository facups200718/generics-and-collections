package com.logs;

import java.util.*;

public class MyArrayList {
    public static void main(String[] args) {
        List list = asList(new String[]{"1", "2", "3"});
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    public static <X> List<X> asList(X[] b) {
        return new MyOwnArrayList<>(b);
    }
    private static final class MyOwnArrayList<X> extends AbstractList<X> {
        private final X[] b;

        MyOwnArrayList(X[] array) {
            b = array;
        }

        @Override
        public X get(int index) {
            return b[index];
        }

        @Override
        public X set(int index, X element) {
            X oldValue = b[index];
            b[index] = element;
            return oldValue;
        }

        @Override
        public int size() {
            return b.length;
        }
    }
}


