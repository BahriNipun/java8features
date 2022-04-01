package com.java8features;

import java.util.Optional;

public class ExampleWithOptional {
	
	public static void main(String[] args) {
		
		String[] cities = new String[10];
		
		/**
		 * Using Optional class, we are doing a null check at cities[5]
		 */
		Optional<String> nullCheck = Optional.ofNullable(cities[5]);
		
		if (nullCheck.isPresent()) {
			String city = cities[5].toLowerCase();
			System.out.print(city);
		} else {
			System.out.println("The array is null");
		}

	}
}
