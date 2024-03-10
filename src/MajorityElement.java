package leetcode.practice;

import java.util.Collections;

public class MajorityElement {
	
	public static void main(String[] args) {
		int[] array= {2, 2, 3, 3, 3, 3, 2};
		majority(array);
	}
	
	public static void majority(int[] nums) {
		int count= 1;
		for(int i= 0; i< nums.length; i++) {
			for(int j= i+1; j< nums.length; j++) {
				count++;
			}
		if(count >= nums.length) {
			System.out.println(nums[i]);
		} else 
			i++;
		
	}
	}
}
