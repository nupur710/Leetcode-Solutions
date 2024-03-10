package leetcode.practice;

public class DecodedXOR {
	
	public static int[] decode(int[] encoded, int first) {
		int[] arr= new int[encoded.length+1];
		arr[0]= first;
		
		for(int j= 1; j<arr.length; j++)
			arr[j]= arr[j-1] ^ encoded[j-1];
		
		return arr;
		
//		for(int i= 0; i<arr.length; i++) 
//			System.out.println(arr[i]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] encodedArray= {6, 2, 7, 3};
		int first= 4;
		decode(encodedArray, first);
	}

}
