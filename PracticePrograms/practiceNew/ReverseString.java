package practiceNew;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println(reverseString("BhavikDoshi"));

	}
	
	public static String reverseString (String str) {
		
		char[] chr = str.toCharArray();
		
		String reverse = null;
		
		int i = 0;
		int j = chr.length - 1;
		
		while (i < j) {
			
			char tmp = chr[i];
			chr[i] = chr[j];
			chr[j] = tmp;
			
			i++;
			j--;
		}
		
		reverse = String.valueOf(chr);
		
		return reverse;
	}
	
	

}
