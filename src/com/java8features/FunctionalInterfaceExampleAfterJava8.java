package com.java8features;

public class FunctionalInterfaceExampleAfterJava8 {

    public static void main(String[] args) {

        // lambda expressions to create object
        new Thread(() -> {
            System.out.println("Functional Interface After to Java 8");
        }).start();

    }
}
