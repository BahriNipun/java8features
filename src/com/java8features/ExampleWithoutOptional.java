package com.java8features;

public class ExampleWithoutOptional {

    public static void main(String[] args) {

        String[] cities = new String[10];
        
        /**
         *  The array is empty is empty.
         *  No null check has been done, it will throw NullPointerException
         */
        String city = cities[5].toLowerCase();
        
        System.out.println(city);

    }
}
