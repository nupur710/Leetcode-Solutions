package leetcode.practice;

public class DIStringMatch {
	
    public static int[] diStringMatch(String s) {
    	int[] arr= new int[s.length()+1];
    	int i= 0;
    	int j= s.length();
    	for(int a= 0; a<s.length(); a++) {
    		if(s.charAt(a) == 'I') {
    			arr[a]= i;
    			i++;
    		}
    		else if(s.charAt(a) == 'D') {
    			arr[a]= j;
    			j--;
    		}
    		arr[arr.length-1]= j;
    	}
    	
    	for(int k= 0; k<arr.length; k++)
    		System.out.println(arr[k]);
    	
    	return arr;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		diStringMatch("DDI");
	}

}
