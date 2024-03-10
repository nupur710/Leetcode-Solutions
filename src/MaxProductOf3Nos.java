package leetcode.practice;

import java.util.Arrays;

public class MaxProductOf3Nos {
	
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];
    }

	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4};
		System.out.println(maximumProduct(arr));

	}

}
