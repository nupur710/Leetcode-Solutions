package leetcode.practice;

import java.util.Arrays;

public class MaximumGap {
	
	static public int maximumGap(int[] nums) {
		if(nums.length==1) {
			return 0;
		} else {
        Arrays.sort(nums);
        int diff= 0;
        int maxDiff= nums[1]-nums[0];
        for(int i= 2; i<nums.length; i++) {
        	diff= nums[i]-nums[i-1];
        	
        	if(diff>maxDiff) {
        		maxDiff= diff;
        	}
        }
		return maxDiff;
    }
	}
}
