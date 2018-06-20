package programs;

import java.util.Scanner;

public class ReverseString {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		String str = scan.next();
		
		System.out.println(reverse(str));		

	}
	
	public static String reverse(String str) {

		char[] chs = str.toCharArray();

		int i = 0, j = chs.length - 1;

		while (i < j) {

			char t = chs[i];
			chs[i] = chs[j];
			chs[j] = t;
			i++;
			j--;

		}

		return String.valueOf(chs);
	}

}
