package leetcode.practice;

public class SmallerThanCurrentNumber {

	public static int[] smallerNumbersThanCurrent(int[] nums) {
		int count= 0;
        int[] lessThan= new int[nums.length];
        for(int i= 0; i<nums.length; i++) {
        	for(int j= 0; j<nums.length; j++) {
        		if(nums[j] != nums[i] && nums[j] < nums[i])
        			count++;
        	}
        	lessThan[i]= count;
        	count= 0;
        }
//        for(int k= 0;  k<lessThan.length; k++)
//        	System.out.println(lessThan[k]);
        return lessThan;
    }
	
	public static void main(String[] args) {
		int[] arr= {7, 7, 7, 7};
		smallerNumbersThanCurrent(arr);
	}
}
