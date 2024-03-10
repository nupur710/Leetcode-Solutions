package leetcode.practice;

public class RichestCustomerWealth {
	
    public static void maximumWealth(int[][] accounts) {
    	int[] wealth= new int[accounts.length];
    	//System.out.println("length of accounts array is " + accounts.length);
    	
        for(int i= 0; i<accounts.length; i++) {
        	int sum= 0;
        	for(int j= 0; j<accounts[i].length; j++) {
        	//	System.out.println(accounts[i][j]);
        	sum  += accounts[i][j];
        	}
        	wealth[i]= sum;
        	//System.out.println("value of wealth for " + i + " is " + wealth[i]);
        }
        
        //Find Max of wealth
        int max= wealth[0];
        for(int k= 0; k<wealth.length; k++) {
        	if(wealth[k] > max)
        		max= wealth[k];
        }
        
        System.out.println("max is " +max);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array= {{2,8,7},{7,1,3},{1,9,5}};
		maximumWealth(array);
	}

}
