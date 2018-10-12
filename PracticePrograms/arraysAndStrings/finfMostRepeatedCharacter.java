package arraysAndStrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class finfMostRepeatedCharacter {

	public static void main(String[] args) {

		String string = "aaaabctcescttcctcctcing";

		System.out.println(String.valueOf(repeatedCharacterByMap(string)));
		System.out.println(String.valueOf(repeatedCharacterByArray(string)));
		System.out.println(String.valueOf(repeatedCharacterWithoutMapOrArray(string)));

	}

	public static Character repeatedCharacterByMap(String str) {

		char result = 0;
		int count = 0;
		Map<Character, Integer> repeat = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {

			char tmp = str.charAt(i);

			if (repeat.containsKey(tmp)) {

				repeat.put(tmp, repeat.get(tmp) + 1);

			} else {

				repeat.put(tmp, 1);
			}
		}

		for (Map.Entry<Character, Integer> e : repeat.entrySet()) {

			if (e.getValue() > count) {

				count = e.getValue();
				result = e.getKey();
			}
		}

		return result;

	}

	public static Character repeatedCharacterByArray(String str) {
		
		final int ASCII_SIZE = 256;

		// Create array to keep the count of individual characters and initialize the array as 0
		int count[] = new int[ASCII_SIZE];

		// Construct character count array from the input string.
		int len = str.length();
		
		for (int i = 0; i < len; i++) {
			
			count[str.charAt(i)]++;			
		}
				
		int max = -1; // Initialize max count
		char result = ' '; // Initialize result

		// Traversing through the string and maintaining the count of each character
		for (int i = 0; i < len; i++) {
			
			if (max < count[str.charAt(i)]) {
				
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}

		return result;

	}
	
	public static Character repeatedCharacterWithoutMapOrArray(String str) {

		char result = ' ';
		int finalCount = 1;
		int tmpCount = 1;
		char tmpchar = ' ';
		
		char[] chr = str.toCharArray();
		
		Arrays.sort(chr);
		//String string = "abctesting"; //aaabceignsttttt
		
		for (int i = 1; i < chr.length; i++) {
			
			tmpchar = chr[i];
			
			if (chr[i] == chr[i-1]) {
				
				tmpCount++;				
				
			} else {				
				
				tmpCount = 1;				
			}
			
			if (tmpCount > finalCount) {
				
				finalCount = tmpCount;						
				result = chr[i-1];
			}
			
		}	
		

		return result;
	}

}
