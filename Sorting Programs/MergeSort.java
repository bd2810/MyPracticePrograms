
public class MergeSort {

	public static void main(String[] args) {

		int[] inputArr = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43 };

		mergeSort(inputArr);

		for (int i : inputArr) {

			System.out.print(i);
			System.out.print(" ");
		}
	}

	public static void mergeSort(int[] inputArr) {

		int length = inputArr.length;

		if (length < 2) {

			return;
		}

		int middle = length / 2;

		int[] left = new int[middle];

		int[] right = new int[length - middle];

		for (int i = 0; i < middle; i++) {

			left[i] = inputArr[i];
		}

		for (int i = middle; i < length; i++) {

			right[i - middle] = inputArr[i];
		}

		mergeSort(left);
		mergeSort(right);
		merge(left, right, inputArr);

	}

	public static void merge(int[] leftArray, int[] rightArray, int[] fullArray) {

		int leftLength = leftArray.length;
		int rightLength = rightArray.length;

		int i = 0, j = 0, k = 0;

		while (i < leftLength && j < rightLength) {

			if (leftArray[i] <= rightArray[j]) {

				fullArray[k] = leftArray[i];
				i++;

			} else {

				fullArray[k] = rightArray[j];
				j++;

			}

			k++;
		}

		while (i < leftLength) {

			fullArray[k] = leftArray[i];
			k++;
			i++;
		}

		while (j < rightLength) {

			fullArray[k] = rightArray[j];
			k++;
			j++;
		}
	}
}
