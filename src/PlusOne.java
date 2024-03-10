package leetcode.practice;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {9};
		plusOne(a);
	}

	public static int[] plusOne(int[] digits) {
		int length= digits.length;
		int count = 0;
		for(int i= 0; i<length; i++) {
			if(digits[i] == 9) {
				count++;
			}
		}
		System.out.println("count is " +count);
		if((count == length)) {
			int[] newArr= new int[digits.length + 1];
			newArr[0]= 1;
			for(int j= 1; j<newArr.length; j++) {
				newArr[j]= 0;
			}
			
			for(int a= 0; a<newArr.length; a++)
				System.out.println(newArr[a]);
		}
		
		
		else if((digits[length-1] == 9)) {
		int[] newArr= new int[digits.length];
		for(int i= length-1; i>=0; i--) {
			int lastD= digits[i];
			if(lastD == 9) {
				lastD = 0;
				newArr[i]= lastD;
				//System.out.println("checked " + digits[i]);
			} else {
				break;
			}
		//	System.out.println("i is " +i);
			newArr[i-1]= digits[i-1] + 1;
			for(int j= i-2; j>=0; j--) {
				newArr[j]= digits[j];
			}

		}
		
		for(int k= 0; k<length; k++)
			System.out.println(newArr[k]);
		return newArr;
	}
		
		else {
			int[] arr= new int[length];
			arr[length-1]= digits[length-1]+1;
			for(int j= 0; j<length-1; j++)
				arr[j]= digits[j];
			for(int k= 0; k<length; k++)
				System.out.println(arr[k]);
			return arr;
		}
		return null;
	}
}
