package arraysAndStrings;

import java.util.HashSet;

public class SudokuChecker {

	public static void main(String[] args) {

		int[][] array = {

				{ 0, 5, 6, 9, 0, 7, 4, 0, 0 }, { 0, 8, 1, 0, 4, 0, 0, 0, 0 }, { 0, 0, 0, 0, 1, 5, 0, 9, 0 },
				{ 0, 0, 0, 0, 0, 3, 8, 5, 7 }, { 8, 4, 0, 0, 6, 0, 0, 2, 3 }, { 7, 3, 9, 2, 0, 0, 0, 0, 0 },
				{ 0, 6, 0, 5, 8, 0, 0, 0, 0 }, { 0, 0, 0, 0, 7, 0, 3, 6, 0 }, { 0, 0, 8, 3, 0, 6, 5, 7, 0 } };
		
		int[][] arr = { 
		        {5, 3, 4, 6, 7, 8, 9, 1, 2}, 
		        {6, 7, 2, 1, 9, 5, 3, 4, 8},
		        {1, 9, 8, 3, 4, 2, 5, 6, 7},
		        
		        {8, 5, 9, 7, 6, 1, 4, 2, 3},
		        {4, 2, 6, 8, 5, 3, 7, 9, 1},
		        {7, 1, 3, 9, 2, 4, 8, 5, 6},
		        
		        {9, 6, 1, 5, 3, 7, 2, 8, 4},
		        {2, 8, 7, 4, 1, 9, 6, 3, 5},
		        {3, 4, 5, 2, 8, 6, 1, 7, 9}
		    };

		try {
			System.out.println(isSudokuValid(arr));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static boolean isSudokuValid(int[][] board) throws Exception {

		boolean isSolved = true;
		boolean rowResult = true;
		boolean columnResult = true;

		if (board == null | board.length != 9) {

			System.out.println("Invalid Sudoku board");
			throw new Exception();
		}

		// For rows
		for (int i = 0; i < 9; i++) {

			HashSet<Integer> set = new HashSet<>();
			Integer row = 0;

			for (int j = 0; j < 9; j++) {

				int num = board[i][j];
				row = j;

				if (num >= 0 && num <= 9) {

					if (num > 0 && num <= 9) {

						if (!set.contains(num)) {

							set.add(num);

						} else {

							System.out.println("Duplicate number: "+num+" found in the row: "+j+" ...invalid Sudoku board");
							throw new Exception();
						}

					} else {

						isSolved = false;
					}

				} else {

					System.out.println("Incorrect number found in the row..invalid Sudoku board");
					throw new Exception();
				}			

			}
			
			if (set.size() != 9) {

				System.out.println("Set length for row :"+row+" is not equal to 9");
				rowResult = false;
			}
		}

		// For Columns
		for (int i = 0; i < 9; i++) {

			HashSet<Integer> set = new HashSet<>();
			Integer column = 0;

			for (int j = 0; j < 9; j++) {

				int num = board[j][i];
				column = i;

				if (num >= 0 && num <= 9) {

					if (num > 0 && num <= 9) {

						if (!set.contains(num)) {

							set.add(num);

						} else {

							System.out.println("Duplicate number: "+num+" found in the column: "+ i + " ...invalid Sudoku board");
							throw new Exception();
						}

					} else {

						isSolved = false;
					}

				} else {

					System.out.println("Incorrect number found in the row..invalid Sudoku board");
					throw new Exception();
				}				

			}
			
			if (set.size() != 9) {

				System.out.println("Set length for column :"+column+" is not equal to 9");
				columnResult = false;
			}
		}

		// For Board - rows
		for (int b = 0; b < 9; b += 3) {

			HashSet<Integer> set = new HashSet<>();
			Integer row = 0;

			for (int i = 0; i < 3; i++) {

				for (int j = 0; j < 3; j++) {

					int num = board[i][j];
					row = j;

					if (num >= 0 && num <= 9) {

						if (num > 0 && num <= 9) {

							if (!set.contains(num)) {

								set.add(num);

							} else {

								System.out.println("Duplicate number: "+num+" found in the row"+j+" ...invalid Sudoku board");
								throw new Exception();
							}

						} else {

							isSolved = false;
						}

					} else {

						System.out.println("Incorrect number found in the row..invalid Sudoku board");
						throw new Exception();
					}

				}

			}
			
			if (set.size() != 9) {

				System.out.println("Set length for row :"+row+" is not equal to 9");
				rowResult = false;
			}

		}

		// For Board - columns
		for (int b = 0; b < 9; b += 3) {

			HashSet<Integer> set = new HashSet<>();
			Integer column = 0;

			for (int i = 0; i < 3; i++) {
				
				column = i;

				for (int j = 0; j < 3; j++) {

					int num = board[j][i];

					if (num >= 0 && num <= 9) {

						if (num > 0 && num <= 9) {

							if (!set.contains(num)) {

								set.add(num);

							} else {

								System.out.println("Duplicate number: "+num+" found in the column"+i+" ...invalid Sudoku board");
								throw new Exception();
							}

						} else {

							isSolved = false;
						}

					} else {

						System.out.println("Incorrect number found in the row..invalid Sudoku board");
						throw new Exception();
					}

					

				}

			}
			
			if (set.size() != 9) {

				System.out.println("Set length for column :"+column+" is not equal to 9");
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

}
