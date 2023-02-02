package com.svv.loop;

import java.util.ArrayList;
import java.util.List;

//Java 8 features ..using along with iterator and stream interface

public class ForEachOrdered {

	public static void main(String[] args) {

		List<String> gamesList = new ArrayList<String>();
		gamesList.add("Football");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hocky");
		System.out.println("------------Iterating by passing lambda expression---------------");
		gamesList.stream().forEachOrdered(games -> System.out.println(games));
		System.out.println("------------Iterating by passing method reference---------------");
		gamesList.stream().forEachOrdered(System.out::println);
	}
}
