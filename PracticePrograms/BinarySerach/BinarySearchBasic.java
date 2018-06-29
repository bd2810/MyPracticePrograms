/*
 * Basic program to search an element in an integer array using binary search 
 * and return it's location (index)
 * Note: Binary search only works when the array is sorted
 */

package BinarySerach;

public class BinarySearchBasic {

	public static void main(String[] args) {

		int[] array = new int[] { 2,6,13,21,36,47,63,81,97 };
		
		int k = 81;
		
		binarySearch(array, k);
	}
	
	static int binarySearch(int[] array, int x) {
		
		int start = 0;
		int end = array.length - 1;
		
		while (start <= end) {
			
			int mid = (start+end)/2;
			
			if (array[mid] == x) {
				
				System.out.println("Success: We found the integer at index: " + mid);
				return mid;
				
			} else if (array[mid] > x) {
				
				end = mid - 1;
				
			} else {
				
				start = mid + 1;
			}
		}
		System.out.println("Failed: We did NOT find the integer in the array");
		return -1;	
		
	}

}
