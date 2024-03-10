package leetcode.practice;

public class NamingACompany {

	public static void distinctNames(String[] ideas) {
		String[] store= new String[2];
		int count= 0;
		int len= ideas.length;
//		int ncr= fact(len);
//		int fact2= fact(2);
//		int rem= fact(len-2);
//		int x= ncr / (fact2 * rem);
		int[][] arr= new int[len * len][2];
		char ch = Character.MIN_VALUE;
		for(int i= 0; i<ideas.length; i++) {
			for(int j= 0; j<ideas.length; j++) {
				System.out.println("i : " + i + " : " + ideas[i] + " , " + "j : " + j + " : " + ideas[j]);
				char a= ideas[i].charAt(0);
				char b= ideas[j].charAt(0);
		//		System.out.println(" i: " + i + " j: "+j);
				ch= a;
				a= b;
				b= ch;
				String valA= String.valueOf(a);
				String valB= String.valueOf(b);
				String newA= String.valueOf(valA) + ideas[i].substring(1, ideas[i].length());
				String newB= String.valueOf(valB) + ideas[i].substring(1, ideas[i].length());
				store[0]= newA;
				store[1]= newB;
		//		System.out.println(store[0] + " , " + store[1]);	
//				for(int k= 0; k<ideas.length; k++) {
//					if(ideas[k].equals(store[0]) || ideas[k].equals(store[1])) {
//						continue;
//					} else
//						count++;
//				}
			}
		//	System.out.println(store[0] + " , " + store[1]);
		}
	}
	
	public static int fact(int n) {
		int val= 1;
		if(n == 0) {
			return 1;
		} else {
			while(n >= 1) {
				val *= n;
				n--;
			} return val;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {"coffee","donuts","time","toffee"};
		distinctNames(s);
	}

}
