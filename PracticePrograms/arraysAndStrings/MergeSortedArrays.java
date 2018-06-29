/*
 * Merge two sorted arrays. You may assume that A has enough space to hold additional elements from B.
 */

package arraysAndStrings;

import java.util.Arrays;

public class MergeSortedArrays {

	public static void main(String[] args) {
		
		int[] a = new int[] {1, 3, 5, 7};

		int[] b = new int[] { 2, 4, 6, 7, 8, 10, 11};
		
		System.out.println("Merged array is: " + Arrays.toString(merge(a, b)));
			
	}
	
	// Method 1: This method assumes array A has enough space to store elements from array B
	public static int[] mergeAgain(int[] a, int[] b) {
		
		int i = a.length;
		int j = b.length;		
	
		while ((i > 0) && (j > 0)) {
			
			if (a[i-1] > b[j-1]) {
				
				a[i+j-1] = a[i-1];
				i--;
				
			} else {	
				
				a[i+j-1] = b[j-1];
				j--;
				
			}			
		}
		
		while (j > 0) {
			
			a[i+j-1] = b[j-1];
			j--;		
		}
		
		// Little efficient than above while loop. It copies all remaining elements from b to tmp array		
		//System.arraycopy(b, 0, a, 0, j-0);
				
		return a;
	}

		
	// Method 2: Little inefficient as it uses more space.
	public static int[] merge(int[] a, int[] b) {
		
		int[] tmp = new int[a.length + b.length];
		int i = 0;
		int j=0;
		int k=0;
		
		while ((i < a.length) && (j < b.length)) {
			
			if (a[i] < b[j]) {
				
				tmp[k] = a[i];
				i++;
				k++;
			
			} else {	
				tmp[k] = b[j];
				j++;
				k++;
				
			}			
		}
		
		while ((i < a.length)) {
			
			tmp[k] = a[i];
			i++;
			k++;		
		}
		
		while ((j < b.length)) {
			
			tmp[k] = b[j];
			j++;
			k++;		
		}
						
		return tmp;
	}	

}
