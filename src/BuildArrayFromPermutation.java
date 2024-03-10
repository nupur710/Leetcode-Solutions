package leetcode.practice;

public class BuildArrayFromPermutation {
	
    public static int[] buildArray(int[] nums) {
        int[] finalArray= new int[nums.length];
        for(int i= 0; i<nums.length; i++) {
        	finalArray[i]= nums[nums[i]];
        }
        for(int j= 0; j<finalArray.length; j++)
        	System.out.println(finalArray[j]);
        return finalArray;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {0,2,1,5,3,4};
		System.out.println(buildArray(array));
	}

}
