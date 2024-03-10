package leetcode.practice;

public class SmallestEvenMultiple {
	
	static int smallestEvenMultiple(int n) {
		for(int i= 2; i<= 298; i+= 2)
			if(i % n == 0)
				return i;
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
