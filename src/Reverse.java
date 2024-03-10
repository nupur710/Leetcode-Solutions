package leetcode.practice;

public class Reverse {
	
    public static int reverse(int x) {
    	int prev= 0;
     int required= 0;
    	 while(x > 0) {
    		 required= required * 10 + (x % 10);
    		 prev= required/10;
    		 x= x/10;
    		 if (required/10 != prev)
    			 return 0;
    	 }
    	 return required;
    }
     
    
    public static int isPositiveOrNegative(int x) {
    	int answer= 0;
    	if(x < 0) {
    		answer= reverse(x* -1);
    	return answer * -1;
    	}
    	else {
    		answer= reverse(x);
    	return answer;
    	}
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPositiveOrNegative(1534236469));
	}

}
