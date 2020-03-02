package com.qa.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println("What is the 6th number in the fibonacci sequence?" + fibonacci(6));
		System.out.println("What is the 24th number in the fibonacci sequence?" + fibonacci(24));
	}

	static int fibonacci(int pos) {
		List<Integer> nums = new ArrayList<>();
		nums.add(0); //adds 0 
		nums.add(1);//adds 1 to the list
		for (int i = 1; i <= pos; i++) { //the index starts at 1 because we add the previous number. 
												
			nums.add(nums.get(i) + nums.get(i - 1));  
		}
		return nums.get(pos);
	}

}
/////another example//
//if (num==0) {
//	return 0;
//	int firstposition = 0;
//	int nextposition =  1;
//	for (int i=1, i < num-1, i++) {
//		int temp = firstposition;
//		firstposition = nextposition;
//		nextposition = firstposition + temp;
//	}
//	return nextpostion
//	
//		}
// }
//

////another solution//
//if(num==0) {
//	return 0;
//}else if (num == 1) {
//	return 1;
//}
//return fibonacci(num-1) + fibonacci(num-2);
//}
//}

//// TEST////
