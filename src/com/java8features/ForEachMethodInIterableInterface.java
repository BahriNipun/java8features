package com.java8features;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethodInIterableInterface {

	public static void main(String[] args) {  
		
		List<String> subList = new ArrayList<String>();  
		subList.add("Maths");  
		subList.add("English");  
		subList.add("French");  
		subList.add("Sanskrit");
		subList.add("Abacus");

		System.out.println("------------Subject List--------------");  
		subList.forEach(sub -> System.out.println(sub));  
		
		System.out.println("------------Search List--------------"); 
		System.out.println(subList.stream().findAny().equals("Dutch"));
		
		System.out.println("------------Filter List--------------"); 
		System.out.println(subList.stream().filter((text) -> text.startsWith("F")).count());
	}  

}
