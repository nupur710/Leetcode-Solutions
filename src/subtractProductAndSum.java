package leetcode.practice;

public class subtractProductAndSum {
	
	static int subtractProductAndSum(int n) {
		int x= n;
		int count= 0;
		while (n > 0) {
			count ++;
			n= n/10;
		}
		int[] digitsArray= new int[count];
		int curr= 0;
		while(x > 0) {
			digitsArray[curr++]= x % 10;
			x = x/10;
		}
		int product= 1, sum= 0;
		for(int i= 0; i<digitsArray.length; i++) {
			product *= digitsArray[i];
			sum += digitsArray[i];
		}
		
		return product - sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subtractProductAndSum(1234);
	}

}
