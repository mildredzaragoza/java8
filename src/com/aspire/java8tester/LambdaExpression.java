package com.aspire.java8tester;

/**
 * Class to test lambda expression
 * @author Mildred Zaragoza
 *
 */
public class LambdaExpression {
	public static void main(String args[]) {
		LambdaExpression tester = new LambdaExpression();
		
		//Different syntax for lambda expression
		MathOperation addition = (int a, int b) -> a + b;
		MathOperation subtraction = (a,b) -> a - b;
		MathOperation multiplication = (a,b) -> { return a*b; };
		MathOperation division = (int a, int b) -> a/b;
		
		System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
	    System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
	    System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
	    System.out.println("10 / 5 = " + tester.operate(10, 5, division));
	}
	
	/*
	 * Functional interface
	 */
	interface MathOperation {
		int operation(int a, int b);
	}
	
	private int operate (int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}
