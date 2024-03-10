package leetcode.practice;

public class CheckLoop {
	
	public static void loop() {
		for(int i= 1; i<=10; i++) {
			for(int j= i+1; j<=10; j++) {
				System.out.println("For " + i + " j is " + j);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loop();
	}

}
