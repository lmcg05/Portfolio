package com.qa.indexOf;

public class IndexOf {
	public static void main(String[] args) {
		System.out.println("What position is the letter 'x' in the sentence 'I like xylophones'?\n"
				+ indexOf('x', "I like xylophones"));

	}

	static int indexOf(char c, String sentence) {
		char[] word = sentence.toCharArray();
		int pos = -1; //
		for (int i = 0; i < sentence.length(); i++) {
			if (c == word[i]) {
				pos = i; 
			}
		}
		return pos;
	}

}


