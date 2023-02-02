package com.svv.loop;

import java.util.ArrayList;
import java.util.List;

// Java 8 features ..using along with iterator and stream interface

//Java provides a new method forEach() to iterate the elements. It is defined in Iterable and Stream interface. It is a default method defined in the Iterable interface. Collection classes which extends Iterable interface can use forEach loop to iterate elements.
//
//This method takes a single parameter which is a functional interface. So, you can pass lambda expression as an argument.

public class ForEach {

	public static void main(String[] args) {

		List<String> gamesList = new ArrayList<String>();
		gamesList.add("Football");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hocky");
		System.out.println("------------Iterating by passing lambda expression--------------");
		gamesList.forEach(games -> System.out.println(games));
		
        System.out.println("------------Iterating by passing method reference---------------");  
		gamesList.forEach(System.out::println);
	}

}
