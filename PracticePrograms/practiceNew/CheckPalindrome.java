package practiceNew;

import java.util.DuplicateFormatFlagsException;
import java.util.HashMap;
import java.util.Map;

public class CheckPalindrome {

	public static void main(String[] args) {
		
		System.out.println(checkPalindrome("aaaabbbbccd"));

	}
	
	static boolean checkPalindrome(String str) {
		
		boolean isPalindrome = false;
		int dup = 0;
		
		Map<Character, Integer> values = new HashMap<>();
		
		for (char c : str.toCharArray()) {
			
			if (values.containsKey(c)) {
				
				values.put(c, values.get(c) + 1);
			} else {
				
				values.put(c, 1);
			}
		}
		
		for (Map.Entry<Character, Integer> e : values.entrySet()) {
			
			if (e.getValue() % 2 == 0) {
				
				dup += 1;				
			}
		}
		
		if (values.size() == dup || values.size() == dup + 1) {
			
			isPalindrome = true;
		}
		
		return isPalindrome;
	}
	

		


}
