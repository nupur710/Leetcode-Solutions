package leetcode.practice;

public class ConvertBinaryNoInLLToInt {
	
	 public static int getDecimalValue(ListNode head) {
		 int count= 1;
		 int s= 0;
		 int sum= 0;
		 ListNode curr= head;
	        while(curr.next != null) {
	        	count++;
	        	curr= curr.next;
	        }
	        int tc= count-1;
	        ListNode nextCurr= head;
	        while(nextCurr != null)
	        {
	        	if(nextCurr.val == 1) {
	        		s= (int) (1 * (Math.pow(2, tc)));
	        	} else if(nextCurr.val == 0) {
	        		s= 0;
	        	}
	        	sum += s;
	        	tc--;
	        	nextCurr= nextCurr.next;
	        }
	        
	        return sum;
	       // System.out.println(sum);
	    }
	 
	 public static void main(String[] args) {
		ListNode h= new ListNode(1);
		h.next= new ListNode(1);
		h.next.next= new ListNode(1);
		getDecimalValue(h);
	}

}
