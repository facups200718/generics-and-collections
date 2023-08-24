package com.logs;

import java.util.ArrayList;

public class MarkerInterfaceInJava {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("data 1");
        list.add("data 2");
        list.add("data 3");
        list.add("data 4");
        for (int i = 0; i < list.size(); i++) {
            // Como implementa la interface RandomAccess, entonces el acceso ordenado de esta manera es
            // posible ya que se almacena en la RAM el orden de añadidura de cada elemento.
            System.out.println(list.get(i));
        }
    }
}
