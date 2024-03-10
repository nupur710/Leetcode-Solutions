package leetcode.practice;

public class XOROperationInArray {
	
	 public static int xorOperation(int n, int start) {
		 int sum= 0;
	        int[] nums= new int[n];
	        for(int i= 0; i<nums.length; i++) {
	        	nums[i]= start + 2 * i;
	        }
	        for(int j= 0; j<n; j++)
	        	sum ^= nums[j];
	        return sum;
	    }
	 
	public static void main(String[] args) {
		xorOperation(4, 3);
	}
}
