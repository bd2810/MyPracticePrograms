/*
 * Realtor.com
 * Write a method to find out if there exists one combination with the given
 * sequence of characters in a String which is palindrome. Return true if
 * exists else return false
 * 
 * eg. - Input = “aabbc” - Output = true (because with above sequence of
 * characters we can form “abcba” string which is a palindrome)
 * 
 * or aaaabbbb -> aabbbbaa
 */

package arraysAndStrings;

import java.util.HashMap;
import java.util.Map;

public class CheckPalindrome_Int {

	public static void main(String[] args) {

		String str = "aaaabbbbccd";
		
		System.out.println("Is string palindrome: " + checkPalindorme(str));

	}

	public static boolean checkPalindorme(String str) {

		boolean isPalindrome = false;
		int dub = 0;
		char[] chr = str.toCharArray();

		Map<Character, Integer> values = new HashMap<Character, Integer>();

		for (int i = 0; i < chr.length; i++) {

			if (values.containsKey(chr[i])) {

				values.put(chr[i], values.get(chr[i]) + 1);

			} else {

				values.put(chr[i], 1);

			}
		}
		
		System.out.println(values);

		for (Map.Entry<Character, Integer> e : values.entrySet()) {

			if (e.getValue() % 2 == 0) {

				dub += 1;
			}
		}

		if ((values.size() == dub) || (values.size() == dub+1)) {

			isPalindrome = true;
		}

		return isPalindrome;
	}

}
