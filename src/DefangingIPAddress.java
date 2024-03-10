package leetcode.practice;

public class DefangingIPAddress {
	
	public static String defanging(String str) {
		String s2= new String(str);
		for(int i= 0; i<str.length(); i++) {
			if(str.charAt(i) == '.') {
				str+= "[.]";
			} else 
				str+= str.charAt(i);
		}
		System.out.println(str);
		return str;
		
	}
	
	
	public static void main(String[] args) {
		defanging("1.1.11.1");
	}

}
