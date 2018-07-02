package sortingPrograms;

public class QuickSort {

	public static void main(String[] args) {

		int[] array = { 7, 2, 1, 6, 8, 5, 3, 4 };
		
		printIntArray(array);

		quickSort(array, 0, array.length - 1);

		for (int i : array) {

			System.out.print(i);
			System.out.print(" ");
		}
	}

	public static void quickSort(int[] array, int start, int end) {

		if (start < end) {

			int partitionIndex = partition(array, start, end); // calling partition

			quickSort(array, start, partitionIndex - 1);

			quickSort(array, partitionIndex + 1, end);

		}

	}

	public static void printIntArray(int[] array) {

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}
		System.out.println("");
	}

	public static int partition(int[] array, int start, int end) {

		int pivot = array[end]; // Pick a pivot point. Picking the end element

		int partitionIndex = start; // set partition index as start initially

		for (int i = start; i < end; i++) {

			if (array[i] <= pivot) {

				swap(array, i, partitionIndex); // swap if element is lesser than pivot
				partitionIndex++;
			}
		}

		swap(array, partitionIndex, end); // swap pivot with element at partition index

		return partitionIndex;

	}

	public static void swap(int[] array, int i, int j) {

		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

}
