package leetcode.practice;

public class BestTimeToBuyAndSellStock {
	
	public static int lowest(int[] arr) {
		if(arr.length == 1) {
			return 0;
		}
		int highest= 0;
		int lowest= arr[0];
		int pos= 0;
		for(int i= 0; i<arr.length-2; i++) {
		if(arr[i+1]<lowest) {
			lowest= arr[i+1];
			pos= i;
		}
		}
		if(pos == arr.length-1 ) {
			return 0;
		}
		System.out.println(lowest + " " + pos);
			highest= arr[pos+1];
			for(int k= pos; k<arr.length-1; k++) {
				if(arr[k+1] > highest) {
					highest= arr[k+1];
				}
			}
			if(highest < lowest) {
				return 0;
			} else {
				return (highest-lowest);
			}
		
	}
	
	public static void main(String[] args) {
		int[] k= {3, 2, 6, 5, 0, 3};
		System.out.println(lowest(k));
	}

}
