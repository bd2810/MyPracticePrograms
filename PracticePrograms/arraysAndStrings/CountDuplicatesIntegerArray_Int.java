/*
 * Shutterfly
 */
package arraysAndStrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountDuplicatesIntegerArray_Int {

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
	
		Map<Integer, Integer> repetitions = new HashMap<Integer, Integer>();

		for (int i = 0; i < array.length; i++) {

			if (repetitions.containsKey(array[i])) {

				repetitions.put(array[i], repetitions.get(array[i]) + 1);

			} else {

				repetitions.put(array[i], 1);
			}
		}

		System.out.println(repetitions);

		for (Map.Entry<Integer, Integer> e : repetitions.entrySet()) {

			if (e.getValue() > 1) {

				duplicates += 1;
			}

		}

		return duplicates;
	
	}

}
