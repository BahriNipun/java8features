package com.java8features;

public class LambdaExample {

    public static void main(String[] args) {
    	
        WishingInterface wishing = () -> {
            return "Hello World!";
        };
        System.out.println(wishing.wish());
    }

    @FunctionalInterface
    interface WishingInterface {
    	
        public String wish();
        
        public String toString();
        
        public int hashCode();
        
        default void demo() {
        	System.out.println("test");
        }
        
        static void demo2() {
        	System.out.println("demo2");
        }  
        
    }
    
}
