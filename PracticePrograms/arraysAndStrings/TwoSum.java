package arraysAndStrings;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {

		int[] array = { 2, 7, 11, 8, 15, 5, 30 };

		int target = 26;

		System.out.println("Integer array is: " + Arrays.toString(array));
		System.out.println("target is: " + target);
		twoSum(array, target);

	}

	public static int[] twoSum(int[] array, int target) {

		int[] result = new int[2];

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if ((array[i] + array[j]) == target) {

					result[0] = i;
					result[1] = j;
					break;
				}
			}

		}

		System.out.println("Two sum is: " + Arrays.toString(result));
		return result;
	}
	
	static int[] newTwoSum (int target, int[] array) {
		
		int[] result = new int[2];
		
		HashMap<Integer, Integer> values = new HashMap<>();
		
		for (int i=0; i<array.length; i++) {
			
			Integer value = values.get(target - array[i]);
			
			if (value == null) {
				
				values.put(array[i], i);
				
			} else {
				
				array[0] = value;
				array[1] = i;
			}
		}	
		
		return result;
	}

}
