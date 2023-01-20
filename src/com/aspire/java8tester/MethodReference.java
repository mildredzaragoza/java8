package com.aspire.java8tester;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {
	public static void main(String args[]) {
		List<Character> letters = new ArrayList();
		letters.add('a');
		letters.add('b');
		letters.add('c');
		letters.add('d');
		letters.add('e');
		
		//To print all elements in a list
		letters.forEach(s -> System.out.print(s));
		
		//Shorthand to print all elements in a list
		System.out.println("\nLetters printed out using a shorthand:");
		letters.forEach(System.out::print);
	}
}
