package leetcode.practice;

public class MaxWordsInSentence {
	
	public static int mostWordsFound(String[] sentences) {
        int count= 0;
        int[] length= new int[sentences.length];
        for(int i= 0; i<sentences.length; i++) {
        	for(int j= 0; j<sentences[i].length(); j++)
        		//System.out.println("sentences[i].length is " + sentences[i].length());
        		if(sentences[i].charAt(j) == ' ')
        			count++;
        	  length[i]= count;
        }
  
        for(int a= 0; a<length.length; a++)
        	System.out.println(length[a]);
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {"Hello my name Nupur", "My name is", "Nupur 123"};
		System.out.println(mostWordsFound(array));
		
		String a= array[1];
		int length= a.length();
		System.out.println("length of 1st sentence is " + length);
		int count= 0;
		for(int i= 0; i<length; i++) {
			if(a.charAt(i) == ' ')
				count++;
				System.out.println("count is " + count);
				
		}
	}

}
