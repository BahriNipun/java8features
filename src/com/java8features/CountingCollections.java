package com.java8features;

import java.util.ArrayList;
import java.util.List;

public class CountingCollections {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Bruce");
        list.add("Tony");
        list.add("Clark");
        list.add("Natasha");
        list.add("Sachin");
        
        int count = 0;
        
        //Iterating over the whole list to find the name having more than 5 characters
        for (String num : list) {
            if (num.length() > 5) {
                count++;
            }
        }
        System.out.println("Total number of people whose names are more than 5 characters: " + count);
    }
}
