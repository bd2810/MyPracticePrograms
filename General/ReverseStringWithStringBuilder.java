/*
 * Write a program to reverse a String using Java's in-build StringBuilder class
 */



import java.util.Scanner;

public class ReverseStringWithStringBuilder {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		String str = scan.next();

		System.out.println(reverseWithStringBuilder(str));

	}

	public static String reverseWithStringBuilder(String str) {

		StringBuilder sb = new StringBuilder(str);

		sb = sb.reverse();

		return sb.toString();
	}

}
