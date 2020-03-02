package com.qa.palindrome;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Is the word 'computer' a palindrome?" + palindrome("computer"));
		System.out.println("Is the word 'race car' a palindrome?" + palindrome("race car"));
			} 
			
			public static boolean palindrome(String sentence) {
				String sentence2 = sentence.toLowerCase().replace(" ", "");
				StringBuilder str = new StringBuilder(sentence2);
				StringBuilder reverseStr = str.reverse();
				System.out.println(reverseStr);
				
				if(sentence2.equals(reverseStr.toString())) {
					return true;
				} else {
				
				return false;
				}
			}

		
}
