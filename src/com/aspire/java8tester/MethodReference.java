package com.aspire.java8tester;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to test method reference
 * @author Mildred Zaragoza
 *
 */
public class MethodReference {
	public static void main(String args[]) {
		//A set of data to work with
		List<Character> letters = new ArrayList<Character>();
		letters.add('a');
		letters.add('b');
		letters.add('c');
		letters.add('d');
		letters.add('e');
		
		//lambda expression that just calls a single method
		letters.forEach(s -> System.out.print(s));
		
		/**
		 * Shorthand to print all elements in a list
		 * lambda expression into a method reference
		 */
		System.out.println("\nLetters printed out using a shorthand:");
		letters.forEach(System.out::print);
	}
}
