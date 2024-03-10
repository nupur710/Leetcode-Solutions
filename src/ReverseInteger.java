package leetcode.practice;

public class ReverseInteger {
	
	public static int reverse(int x) {
		int req= 0, prev= 0;
		int valueOfX= (x > 0) ? x : -x;
		while(valueOfX > 0) {
			req= req * 10 + (valueOfX % 10);
			prev= req/10;
			valueOfX= valueOfX/10;
			if(prev != req) {
				return 0;
			}
		}
		int ans= (x > 0) ? req : req * -1;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(321));
	}

}
