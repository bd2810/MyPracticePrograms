import java.util.HashSet;

public class LongestUniqueSubstring {

	public static String subString(String input) {

		HashSet<Character> set = new HashSet<Character>();

		String longestOverAll = "";
		String longestTillNow = "";

		int i = 0;
		while (i < input.length()) {

			char c = input.charAt(i);

			if (set.contains(c)) {
				i = i - (longestTillNow.length() - 1);
				longestTillNow = "";
				set.clear();
			} else {
				longestTillNow += c;
				set.add(c);
				i++;
			}

			if (longestTillNow.length() > longestOverAll.length()) {
				longestOverAll = longestTillNow;
			}
		}

		return longestOverAll;
	}

	public static void main(String[] args) {
		String input = "abcad";
		System.out.println(subString(input));
	}

}
