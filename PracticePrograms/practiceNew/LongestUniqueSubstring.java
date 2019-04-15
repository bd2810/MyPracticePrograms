/*
 * write a program to find the longest unique substring
 * For e.g input = "abcadabce" ---> output = "dabce"
 */

package practiceNew;

import java.util.HashSet;
import java.util.Set;

import org.w3c.dom.css.ElementCSSInlineStyle;

public class LongestUniqueSubstring {
	
	public static void main(String[] args) {
		
		String input = "abcadabce";
		System.out.println(subString(input));
	}

	public static String subString(String input) {
		
		String tmp = "";
		String longest = "";
		char[] chr = input.toCharArray();
		HashSet<Character> set = new HashSet<>();
		
		for (int i = 0; i < chr.length; i++) {
			
			if (!set.contains(chr[i])) {
				
				set.add(chr[i]);
				tmp = tmp+chr[i];
				
			} else {
				
				set.clear();
				i = tmp.length() - 1;
				
				if (tmp.length() > longest.length()) {
					
					longest = tmp;
				}
				
				tmp = "";
				
			}
		}
		
		return longest;


	}



}
