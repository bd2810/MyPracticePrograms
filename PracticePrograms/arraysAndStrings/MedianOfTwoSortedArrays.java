package arraysAndStrings;

import java.util.Arrays;
import java.util.Scanner;


public class MedianOfTwoSortedArrays {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the size of array num1:");
		int n1 = scan.nextInt();

		int[] num1 = new int[n1];

		System.out.println("Add integers to array num1:");

		for (int i = 0; i < n1; i++) {

			num1[i] = scan.nextInt();

		}

		System.out.println("Enter the size of array num2:");
		int n2 = scan.nextInt();

		System.out.println("Add integers to array num2:");
		int[] num2 = new int[n2];

		for (int i = 0; i < n2; i++) {

			num2[i] = scan.nextInt();

		}
		
		System.out.println("Median of array is: " + findMedian(n1, num1, n2, num2));
	}

	public static double findMedian(Integer n1, int[] num1, int n2, int[] num2) {

		double d = 0.0;
		
		int[] tmp = new int[n1 + n2];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < n1 && j < n2) {

			if (num1[i] < num2[j]) {

				tmp[k] = num1[i];
				k++;
				i++;

			} else {

				tmp[k] = num2[j];
				k++;
				j++;
			}
		}

		while (i < n1) {

			tmp[k] = num1[i];
			k++;
			i++;

		}

		while (j < n2) {

			tmp[k] = num2[j];
			k++;
			j++;

		}
		
		System.out.println(Arrays.toString(tmp));
		
		if (tmp.length % 2 == 0) {
			
			d = ((tmp[(tmp.length/2) - 1] + tmp[(tmp.length/2)])/2.0);
			
		} else {
			
			d = (tmp[tmp.length/2]);
		}
		
		return d;

	}

}
