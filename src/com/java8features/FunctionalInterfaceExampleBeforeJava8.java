package com.java8features;

public class FunctionalInterfaceExampleBeforeJava8 {

    public static void main(String[] args) {

        // Creating anonymous inner class object
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Functional Interface Prior to Java 8");
            }
        }).start();
    }
}
