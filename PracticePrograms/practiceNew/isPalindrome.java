package practiceNew;

import java.util.HashMap;
import java.util.Map;

public class isPalindrome {

	public static void main(String[] args) {
		
		System.out.println(checkPalindrome("helaleh"));

	}
	
	public static boolean checkPalindrome(String str) {
		
		boolean result = false;
		
		int i = 0;
		int j = str.length() - 1;
		
		while (i < j) {
			
			if (str.charAt(i) == str.charAt(j)) {
				
				result = true;
				
			} else {
				
				return false;
			}
			
			i++;
			j--;
		}
		
		return result;

	}

}
