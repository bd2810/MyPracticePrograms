

/*
 * write a program to find the longest unique substring
 * For e.g input = "abcadabce" ---> output = "dabce"
 */

import java.util.HashSet;

public class LongestUniqueSubstring {

	public static String subString(String input) {

		HashSet<Character> set = new HashSet<Character>();

		String longestUniqueSubString = "";
		String substr = "";

		int i = 0;
		while (i < input.length()) {

			char c = input.charAt(i);

			if (set.contains(c)) {
				i = i - (substr.length() - 1);
				substr = "";
				set.clear();
			} else {
				substr += c;
				set.add(c);
				i++;
			}

			if (substr.length() > longestUniqueSubString.length()) {
				longestUniqueSubString = substr;
			}
		}

		return longestUniqueSubString;
	}

	public static void main(String[] args) {
		String input = "abcadabce";
		System.out.println(subString(input));
	}

}
