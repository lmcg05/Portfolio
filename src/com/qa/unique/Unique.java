package com.qa.unique;

public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Unique("sentence"));
	}
	public static String Unique(String c) {
		c = c.replace(" ", " ");
		String Unique = "";
		for (int i=0 ; i <c.length();i++) {
			if (!Unique.contains(c.substring(i+1))) {
				Unique = Unique + c.substring(i+1);
			}
			
			}
		return Unique;
		}
	
	}

