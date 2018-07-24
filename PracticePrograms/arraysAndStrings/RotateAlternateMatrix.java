package arraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateAlternateMatrix {

	public static void main(String[] args) {
		
		int[][] matrix = {
				{1, 2},		
				{3, 4, 5, 6 },
				{7, 8, 9, 10, 11 }};
		
		System.out.println(rotate(matrix));
	}
				

	public static List<Integer> rotate(int[][] matrix) {

		List<Integer> rotateList = new ArrayList<Integer>();

		for (int i = 0; i < matrix.length; i++) {

			if (i % 2 == 0) {

				for (int j = 0; j < matrix[i].length; j++) {

					rotateList.add(matrix[i][j]);
				}
			} else {
				for (int j = matrix[i].length-1; j >=0 ; j--) {

					rotateList.add(matrix[i][j]);
				}
			}
		}

		return rotateList;

	}

}
