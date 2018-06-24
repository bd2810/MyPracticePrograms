package arraysAndStrings;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicatesWithHashMap {

	public static void main(String[] args) {

		String string = "PracticePrograms";

		System.out.println("String is: " + string);

		countDuplicates(string);
	}

	public static void countDuplicates(String string) {

		int duplicates = 0;
		char[] chr = string.toCharArray();

		Map<Character, Integer> repetitions = new HashMap<Character, Integer>();

		for (int i = 0; i < chr.length; i++) {

			if (repetitions.containsKey(chr[i])) {

				repetitions.put(chr[i], repetitions.get(chr[i]) + 1);

			} else {

				repetitions.put(chr[i], 1);
			}
		}

		System.out.println(repetitions);

		for (Map.Entry<Character, Integer> e : repetitions.entrySet()) {

			if (e.getValue() > 1) {

				duplicates += 1;
			}

		}

		System.out.println("There are '" + duplicates + "' duplicate characters in the given string.");
	}

}
