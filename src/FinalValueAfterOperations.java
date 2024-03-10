package leetcode.practice;

public class FinalValueAfterOperations {
	
   public static int finalValueAfterOperations(String[] operations) {
        int rsult= 0;
        for(int i= 0; i<operations.length; i++) {
        	switch(operations[i]) {
        		case "--X":
        		case "X--":
        			rsult--;
        			break;
        		case "++X":
        		case "X++":
        			rsult++;
        			break;
        		default:
        			rsult += 0;
        			break;
        			
        	}
        }
        return rsult;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] op= {"X++","++X","--X","X--"};

		finalValueAfterOperations(op);
	}

}
