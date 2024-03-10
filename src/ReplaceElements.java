package leetcode.practice;

public class ReplaceElements {
	
	public static int[] replaceElements(int[] arr) {
		int max= 0;
		for(int i= 0; i<arr.length-1; i++) {
			max= arr[i+1];
			for(int j= i+1; j<arr.length; j++) {
				if(arr[j] > max)
					max= arr[j];
				    arr[i]= max;
			}
			//arr[arr.length-1]= -1;
			//System.out.println("For i " + i + " rightmost max is " + max);
		}
		arr[arr.length-1]= -1;
//		for(int a= 0; a<arr.length; a++)
//			System.out.println(arr[a]);
		return arr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {17,18,5,4,6,1};
		replaceElements(nums);

	}

}
