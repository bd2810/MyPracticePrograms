/*
 * Program to count number of inversions in an integer array.
 * Inversion means if a[i] > a[j], but i < j ..than it is an inversion.
 * For e.g. arr [2, 3, 1, 5, 4]. Here 2 > 1, however it's respective index i.e. 0 < 2. Hence, it's an inversion
 */

package sortingPrograms;

public class CountInversionWithMergeSort {
	
	public static void main(String[] args) {
		
		int[] arr = {2,3,1,5,4,8,6};
		
		//System.out.println(countInversionSimple(arr));
		System.out.println(mergeSort(arr, 0, arr.length));
	}
	
	// Method 1: This is simple implementation using for loops with time complexity O(n^2)
	public static int countInversionSimple(int[] array) {
		
		int count = 0;
		
		for (int i=0; i<array.length; i++) {
			
			for (int j=i+1; j<array.length; j++) {
				
				if (array[i] > array[j]) {
					
					count += 1;
				}
			}
		}
		
		return count;
		
	}
	
	// Method 2: With Divide and Conquer using Merge Sort. Time Complexity = O(n log n)
	public static int mergeSort(int[] array, int left, int right) {
		
		int count = 0;		
		
		if (right > left) {
			
			int middle = (right+left)/2;
			
			count += mergeSort(array, left, middle);
			count += mergeSort(array, middle+1, right);
			
			count += merge(array, left, middle+1, right);
		}		
		
		return count;
	}
	
	private static int merge(int[] array, int left, int middle, int right) {
		
		int count = 0;
		
		int[] tmp = new int[array.length];
		
		int i = left;
		int j= right;
		int k = left;
		
		while ((i <= middle-1) && (j <= right)) {
			
			if (array[i] <= array[j]) {
				tmp[k] = array[i];
				i++;
				k++;	
				
			} else {
				tmp[k] = array[j];
				j++;
				k++;
				
			}			
		}
		
		count += middle - i;
		
		while (i <= middle - 1) {
			tmp[k] = array[i];
			k++;
			i++;
		}
		
		while (j <= right) {
			tmp[k] = array[j];
			k++;
			j++;
		}
		
		return count;	
		
	}
}
