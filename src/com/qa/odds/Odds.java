package com.qa.odds;

import java.util.ArrayList;
import java.util.List;

public class Odds {
	public List<Integer> oddity(int[] nums) {
		List<Integer> numList = new ArrayList<Integer>();
		for(int numbers: nums) {
			if(numbers%2!=0) {
				numList.add(numbers);
			}
		}
		

		return numList;
		
	}

	


}
