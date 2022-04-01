package com.java8features;

import java.util.ArrayList;
import java.util.List;

public class CountingCollectionsUsingStreams {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Bruce");
		list.add("Tony");
		list.add("Clark");
		list.add("Natasha");
		list.add("Sachin");

		/**
		 * Using stream with lambda expression
		 * Here stream(), filter() and count() operations are occurring parallelly
		 * Using stream operations greatly enhances the performance of the code
		 */
		long count = list.stream().filter(num -> num.length() > 5).count();
		
		System.out.println("Total number of people whose names are more than 5 characters: "
				+ count);
	}
}
