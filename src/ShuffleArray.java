package leetcode.practice;

public class ShuffleArray {
	
	public static int[] shuffle(int[] nums, int n) {

        int[] array1= new int[n];
        int[] array2= new int[n];
        int[] finalArray= new int[2 * n];
        int x= 1, y= n;
        
        //Copy 1st half in array1
        for(int i= 0; i<=n-1; i++)
        	array1[i]= nums[i];
        
        //Copy 2nd half in array2
        for(int j= 0; j<=n-1; j++)
        	array2[j]= nums[j+n];
        
    	//Final array
    	for(int i= 0; i<=n-1; i++) {
    		finalArray[i * 2]= array1[i];

    	}
    	
    	for(int j= 0; j<=n-1; j++) {
    		finalArray[x]= array2[j];
    	//	System.out.println("final array at index " + x + " is being inserted with array2 index " + array2[j]);
    		x= x+2;
    	}
    	
//    	for(int a= 0; a<finalArray.length; a++)
//    		System.out.println(finalArray[a]);
    	return finalArray;
    	

    }
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] check= {1, 1, 2, 2};
		shuffle(check, 2);
	}

}
