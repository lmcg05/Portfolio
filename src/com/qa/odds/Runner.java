package com.qa.odds;

public class Runner {
	public static void main(String args[]) {
		Odds odds = new Odds();
		int[] nums = new int[] {58,19,3,42,6,7,9,10,11,15,17,19,18};
		System.out.println(odds.oddity(nums));

	}


}
