package leetcode.practice;

public class NoZeroInteger {
	
	public static void getNoZeroIntegers(int n) {
		int j= 0;
		boolean check= false;
        int[] result= new int[2];
        for(int i= 1; i<=n/2; i++) {
        	j= n-i;
        	check= ifNonZero(i, j);
        	if(check == false)
        		break;
        	else
        		System.out.println("i is " + i + " and j is " + j + " the result is " + check);
        	result[0]= i;
        	result[1]= j;
        //	System.out.println(result[0] + " and " + result[1]);
        }
	}
    
    public static boolean ifNonZero(int a, int b) {
    	boolean res = false;
    	while(a > 0 || b > 0) {
    		if(a % 10 == 0 || b % 10 == 0) {
    			res= false;
    		}
    		a= a/10;
    		b= b/10;
    		res= true;
    	}
		return res;
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getNoZeroIntegers(1000);
	}

}
