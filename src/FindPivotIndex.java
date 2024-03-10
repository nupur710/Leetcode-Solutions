package leetcode.practice;

public class FindPivotIndex {

	public static int pivotIndex(int[] nums) {
		int sum= 0, pos= 0;
		int leftSum= 0, rightSum= 0;
		for(int i= 0; i<nums.length; i++) {
			sum += nums[i];
		} for(int j= 0; j<nums.length; j++) {
			if(j>=1) {
			leftSum += nums[j-1];
			} else {
				leftSum= 0;
			}
			System.out.println("ls " + leftSum);
			rightSum = sum - (leftSum + nums[j]);
			System.out.println("rs " + rightSum);
			if(leftSum == rightSum) {
				 pos= j;
				 break;
			} else pos = -1;
		}
		return pos;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,7,3,6,5,6};
		System.out.println(pivotIndex(nums));
	}

}
