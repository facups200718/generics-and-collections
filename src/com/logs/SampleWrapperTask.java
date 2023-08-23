package com.logs;

public class SampleWrapperTask {
    public static void main(String[] args) {
        // Primitive to wrapper
        int number = 120;
        Integer object = Integer.valueOf(number);
        double number2 = 120.12;
        Double object2 = Double.valueOf(number2);

        // Wrapper to primitive
        int number3 = object.intValue();
        double number4 = object2.doubleValue();
    }
}
