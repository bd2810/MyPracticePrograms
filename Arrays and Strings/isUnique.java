/*
 * Implement an algorithm to determine if a string has all unique characters. What if you
 * cannot use additional data structures?
 */
public class isUnique {

	public static void main(String[] args) {

		String string = "bhavik";
		System.out.println(isStringUnique(string));

	}
	
	// Method 1: Brute Force. Time Complexity = O(n^2)
	public static boolean isStringUnique(String str) {
		
		boolean isUnique = false;
		
		for (int i=0; i<str.length(); i++) {
			
			for (int j=i+1; j<str.length(); j++) {
				
				if (str.charAt(i)==str.charAt(j)) {
					isUnique = false;
					return isUnique;
				} else {
					isUnique = true;
				}
				
			}			
		}
		
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

}
