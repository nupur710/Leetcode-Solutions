package leetcode.practice;

public class MergeSortedArray {

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int len1= nums1.length;
		int len2= nums2.length;
		int j= 0;
		for(int i= len1-len2; i<len1; i++) {
			nums1[i]= nums2[j++];
		}
		
		nums1= swap(nums1);
		
		for(int k= 0; k<len1; k++)
			System.out.println(nums1[k]);
	}
	
	public static int[] swap(int[] arr) {
		int temp= 0;
		for(int i= 0; i<arr.length; i++) {
			for(int j= i+1; j<arr.length; j++) {
				if(arr[j] <arr[i]) {
					temp= arr[j];
					arr[j]= arr[i];
					arr[i]= temp;
				}
			}
		}
		for(int k= 0; k<arr.length; k++)
			System.out.println(arr[k]);
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr1= {1,2,3,0,0,0};
		int[] arr2= {2,5,6};
		int a= 3;
		int b= 3;
		int[] c= {1, 2, 3, 2, 5, 6};
		swap(c);
	//	merge(arr1, a, arr2, b);
	}

}
