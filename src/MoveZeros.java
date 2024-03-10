package leetcode.practice;

public class MoveZeros {
	
	public static void moveZeroes(int[] nums) {
		int j= nums[0];
		while(nums[j] != nums.length-2) {
			if(nums[j] == 0 && nums[j+1] != 0) {
				int temp= nums[j];
				nums[j]= nums[j+1];
				nums[j+1]= temp;
			}
			j++;
		}
        
		for(int a= 0; a<nums.length; a++) {
			System.out.println(nums[a]);
		}
    }
	
	public static void swap(int a, int b) {
		int temp= 0;
		temp= a;
		a= b;
		b= temp;
	}
	
	public static void main(String[] args) {
		int[] arr= {0, 1, 0, 3, 12};
		moveZeroes(arr);
	}

}
