package leetcode.practice;

public class NonZeroInteger {
	
	public static void nonZero(int n) {
		for(int i= 0; i<n; i++) {
		while(n > 0) {
			if(n % 10 == 0) {
				System.out.println("contains zero");
			    break;
			}
			n /= 10;
		}
		System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nonZero(505);
	}

}
