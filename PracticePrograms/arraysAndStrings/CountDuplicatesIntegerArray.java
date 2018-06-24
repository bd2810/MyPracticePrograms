package arraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CountDuplicatesIntegerArray {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		int[] array = new int[7];

		for (int i = 0; i < array.length; i++) {

			array[i] = scan.nextInt();
		}

		System.out.println("Integer array is: " + Arrays.toString(array));
		System.out.println("There are '" + countDuplicates(array) + "' duplicate numbers.");

	}

	public static int countDuplicates(int[] array) {

		int duplicates = 0;

		ArrayList<Integer> newArray = new ArrayList<Integer>();

		for (int i = 0; i < array.length; i++) {

			if (newArray.contains(array[i])) {

				duplicates += 1;

			} else {
				newArray.add(array[i]);
			}
		}

		return duplicates;
	}

}
