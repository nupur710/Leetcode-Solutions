package leetcode.practice;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {
	
	public static List<Integer> breakingRecords(List<Integer> scores) {
	    // Write your code here
		int maxCount= 0;
		int minCount= 0;
		int max= scores.get(0);
		int min= scores.get(0);
		
		for(int i= 1; i<scores.size(); i++) {
			if(scores.get(i) > max) {
				max= scores.get(i);
				maxCount++;
			} else if(scores.get(i) < min) {
				min= scores.get(i);
				minCount++;
			}
		}
		ArrayList<Integer> li= new ArrayList<Integer>();
		li.add(max);
		li.add(min);
		System.out.println(maxCount);
		System.out.println(minCount);
		return li;
	    }

	public static void main(String[] args) {
		ArrayList<Integer> li= new ArrayList<Integer>(List.of(10, 5, 20, 20, 4, 5, 2, 25, 1));
		breakingRecords(li);
	}
}
