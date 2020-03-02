package com.qa.find;

public class Find {
	public boolean find(String s, int i, char c) {
		if(s.charAt(i-1) == c) {
			return true;
		}else {
			return false;
		}
	}

}
