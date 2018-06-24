/*
 * Program to check if two strings are permutation of each other
 * e.g. "apple" and "papel" are permutation of each i.e. have same characters
 * e.g. "hello"and "llloh" are not permutation of each other
 */

package arraysAndStrings;

import java.util.Arrays;

public class CheckPermutation {

	public static void main(String[] args) {
		
		String str1 = "apple";
		String str2 = "paple";		
		System.out.println(checkPermutation(str1, str2));
	}

	//Time complexity = O(1). Space complexity = O(n)
	public static boolean checkPermutation(String string1, String string2) {
		
		boolean result = false;
		
		if (string1.length() != string2.length()) {
			return false;
		}
		
		char[] c1 = string1.toCharArray();
		char[] c2 = string2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if (Arrays.equals(c1, c2)) {
			
			result = true;		
		}		
		
		return result;
	}
}
