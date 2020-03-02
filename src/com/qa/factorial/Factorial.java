package com.qa.factorial;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("The factorial of 10 is equal to: " + factorials(3));
		System.out.println("The factorial of 6 is equal to: " + factorials(4));
	}

	public static int factorials(int i) {
		int number = 1;
		while (i > 0) {
			number = number * i;
			i--;
		}
		return number;
	}


}
