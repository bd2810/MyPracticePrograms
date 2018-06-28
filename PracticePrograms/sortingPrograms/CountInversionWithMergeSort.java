/*
 * Program to count number of inversions in an integer array.
 * Inversion means if a[i] > a[j], but i < j ..than it is an inversion.
 * For e.g. arr [2, 3, 1, 5, 4]. Here 2 > 1, however it's respective index i.e. 0 < 2. Hence, it's an inversion
 */

package sortingPrograms;

public class CountInversionWithMergeSort {

	public static void main(String[] args) {

		int[] arr = new int[] { 2, 3, 1, 5, 4, 8, 6 };

		System.out.println("Number of inversions are: " + countInversionSimple(arr));
		System.out.println("Number of inversions are: " + mergeSort(arr, 0, arr.length - 1));
	}

	// Method 1: This is simple implementation using for loops with time complexity O(n^2)
	public static int countInversionSimple(int[] array) {

		int count = 0;

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] > array[j]) {

					count += 1;
				}
			}
		}

		return count;

	}

	// Method 2: Using Divide and Conquer (MergeSort). Time complexity = O(n log n)
	static int mergeSort(int arr[], int left, int right) {

		int mid;
		int finalCount = 0;

		if (right > left) {

			mid = (right + left) / 2;

			// Recursively call mergeSort for left and right sub-arrays
			finalCount += mergeSort(arr, left, mid);
			finalCount += mergeSort(arr, mid + 1, right);

			/* Merge the two parts */
			finalCount += merge(arr, left, mid + 1, right);
		}
		return finalCount;
	}

	/*
	 * This method merges two sorted arrays and returns inversion count in the
	 * arrays.
	 */
	static int merge(int arr[], int left, int mid, int right) {
		int i, j;
		int count = 0;

		i = left; /* i is index for left subarray */
		j = mid; /* j is index for right subarray */
		while ((i <= mid - 1) && (j <= right)) {
			if (arr[i] <= arr[j]) {
				i++;

			} else {
				j++;
				count = count + (mid - i);
			}
		}

		return count;
	}

}
