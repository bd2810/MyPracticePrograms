/*
 * Implement an algorithm to determine if a string has all unique characters. What if you
 * cannot use additional data structures?
 */

package arraysAndStrings;

public class isUnique {

	public static void main(String[] args) {

		String string = "bhavik";
		System.out.println(isStringUnique(string));

	}
	
	// Method 1: Brute Force. Time Complexity = O(n^2)
	public static boolean isStringUnique(String str) {
		
		boolean isUnique = false;
		
		for (int i=0; i<str.length() - 1; i++) {
			
			for (int j=i+1; j<str.length(); j++) {
				
				if (str.charAt(i)==str.charAt(j)) {

					return isUnique;
				}
				
			}			
		}
		
		isUnique = true;
		
		return isUnique;
	}
	
	// Method 2: Optimized time complexity = O(n)
	public static boolean isUniqueChars(String str) {
		if (str.length() > 128) {			// we usually use 128 ASCII characters
			return false;
		}
		boolean[] char_set = new boolean[128];	// boolean array is initialized with all false values by default
		
		for (int i = 0; i < str.length(); i++) {
			
			int val = str.charAt(i);	// int value of str.charAt(i) is basically the ASCII code of string value.
										// a=97, b=98, A=65, etc.
			
			if (char_set[val]) { 		// if char_set at value say 97 is true...than character is already present in array
				return false; 			// ..and return false
			} else {
				char_set[val] = true;	// if not set it to true...so the next time it occurs, we can say string not unique
			}			
		}
		return true;
	}
	
	// Method 3: It assumes string only has letters a through z.
	// Refer youtube video for explanation - https://www.youtube.com/watch?v=rcsjJQiZQcQ
	// It uses bit-wise operators
	// 0000000....000000000
	// zyx.............dcba
	public static boolean isUniqueChar(String str) {
		
		if (str.length() > 26) { // Only 26 characters
			return false;
		}
		int checker = 0; // In 32-bits it is represented as 0000....00000 (32 0s)
		
		for (int i = 0; i < str.length(); i++) {
			
			int val = str.charAt(i) - 'a';	// for str.charAt(i) = b ... it would be 98 - 97 = 1
			
			// The below condition will occur whenever there is already a 1 in it's position 
			// and & operation will result in 1 which is > 0
			if ((checker & (1 << val)) > 0) { 	// 1 << val means shift 1 (000...0001) by 1. It will be (000...001) --> (000...010)
				return false;		// bit-wise & operation between checker (000..000) and (000...010) --> (000...000)
			}
			checker |= (1 << val);	// checker = checker (000...000) + 1 << val (000..001) --> (000..001)
		}
		return true;
	}

}
