package leetcode.practice;

import java.util.Arrays;

public class MinSumAfterSplittingDigits {
	
	static void minSumAfterSplittingDigits(int n) {
		int[] digits= new int[4];
		int curr= 0;
		while( n > 0) {
			digits[curr++]= n % 10;
			n= n/10;
		}
		Arrays.sort(digits);
		int sum= (digits[0] * 10 + digits [2]) + (digits[1] * 10 + digits[3]);
		
		for(int i= 0; i<digits.length; i++)
			System.out.println(digits[i]);
		
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		minSumAfterSplittingDigits(4009);
	}

}
