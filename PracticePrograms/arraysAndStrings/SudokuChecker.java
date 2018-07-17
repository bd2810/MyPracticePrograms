package arraysAndStrings;

import java.util.HashSet;

public class SudokuChecker {

	public static boolean isSolved = true;
	public static boolean rowResult = true;
	public static boolean columnResult = true;

	public static void main(String[] args) throws Exception {

		int[][] array = {

				{ 0, 5, 6, 9, 0, 7, 4, 0, 0 }, { 0, 8, 1, 0, 4, 0, 0, 0, 0 }, { 0, 0, 0, 0, 1, 5, 0, 9, 0 },
				{ 0, 0, 0, 0, 0, 3, 8, 5, 7 }, { 8, 4, 0, 0, 6, 0, 0, 2, 3 }, { 7, 3, 9, 2, 0, 0, 0, 0, 0 },
				{ 0, 6, 0, 5, 8, 0, 0, 0, 0 }, { 0, 0, 0, 0, 7, 0, 3, 6, 0 }, { 0, 0, 8, 3, 0, 6, 5, 7, 0 } };

		int[][] arr = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },

				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },

				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7 } };
		

		try {
			System.out.println(isSudokuValid(arr));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static boolean isSudokuValid(int[][] board) throws Exception {

		if (board == null | board.length != 9) {

			System.out.println("Invalid Sudoku board");
			throw new Exception();
		}

		// For rows
		for (int i = 0; i < 9; i++) {
			
			if (board[i].length != 9) {
				
				System.out.println("Invalid Sudoku board: Column: "+i+ " size is less than 9");
				throw new Exception();				
			}

			HashSet<Integer> set = new HashSet<>();

			for (int j = 0; j < 9; j++) {

				set = checkRowsAndColumns(board, set, i, j, true);
			}

			if (set.size() != 9) {

				System.out.println("Set length for row :" + i + " is not equal to 9");
				rowResult = false;
			}
		}

		// For Columns
		for (int i = 0; i < 9; i++) {

			HashSet<Integer> set = new HashSet<>();
			Integer j = 0;

			for (j = 0; j < 9; j++) {

				set = checkRowsAndColumns(board, set, j, i, false);
			}

			if (set.size() != 9) {

				System.out.println("Set length for column is not equal to 9");
				columnResult = false;
			}
		}

		// For Board - rows
		for (int b = 0; b < 9; b += 3) {

			HashSet<Integer> set = new HashSet<>();
			Integer row = 0;

			for (int i = 0; i < 3; i++) {

				for (int j = 0; j < 3; j++) {

					set = checkRowsAndColumns(board, set, i, j, true);
				}
			}

			if (set.size() != 9) {

				System.out.println("Set length for 3x3 board for row :" + row + " is not equal to 9");
				rowResult = false;
			}
		}

		// For Board - columns
		for (int b = 0; b < 9; b += 3) {

			HashSet<Integer> set = new HashSet<>();

			for (int i = 0; i < 3; i++) {

				for (int j = 0; j < 3; j++) {

					set = checkRowsAndColumns(board, set, j, i, false);
				}
			}

			if (set.size() != 9) {

				System.out.println("Set length for 3x3 board for column is not equal to 9");
				columnResult = false;
			}
		}

		if (isSolved && rowResult && columnResult) {

			System.out.println("Sudoku board is valid and filled");
			return true;

		} else {

			System.out.println("Sudoku board is valid but not filled");
			return false;
		}
	}

	public static HashSet<Integer> checkRowsAndColumns(int[][] board, HashSet<Integer> set, int row, int col,
			boolean isRow) throws Exception {

		Integer num = 0;

		if (isRow) {

			num = board[row][col];

		} else {

			num = board[col][row];
		}

		if (num >= 0 && num <= 9) {

			if (num > 0 && num <= 9) {

				if (!set.contains(num)) {

					set.add(num);

				} else {

					if (isRow) {
						System.out.println(
								"Duplicate number: " + num + " found in the row: " + row + " ...invalid Sudoku board");
					} else {
						System.out.println(
								"Duplicate number: " + num + " found in the col: " + col + " ...invalid Sudoku board");
					}

					throw new Exception();
				}

			} else {

				isSolved = false;
			}

		} else {

			System.out.println("Incorrect number found in the line..invalid Sudoku board");
			throw new Exception();
		}

		return set;
	}
}
