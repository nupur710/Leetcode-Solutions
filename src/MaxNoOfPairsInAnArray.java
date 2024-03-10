package leetcode.practice;

public class MaxNoOfPairsInAnArray {

	public static int[] numberOfPairs(int[] nums) {
		int count= 1;
		int np= 0;
		int len= nums.length;
		int pair= 0;
		for(int i= 0; i<nums.length; i++) {
			for(int j= i+1; j<nums.length; j++) {
				if(nums[i] == nums[j]) {
					count++;
				} else continue;
			} if(count % 2 == 0) {
				pair++;
				count= 1;
			}
			
		}
		np= len - (2 * pair);
		int[] arr= new int[2];
		arr[0]= pair;
		arr[1]= np;
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr= {0};
		numberOfPairs(arr);
	}

}
