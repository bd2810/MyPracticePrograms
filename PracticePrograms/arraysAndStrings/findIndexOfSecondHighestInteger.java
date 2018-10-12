package arraysAndStrings;

public class findIndexOfSecondHighestInteger {

	public static void main(String[] args) {
		
		// Different test cases/conditions to test beow programs
		
		int[] arr1 = new int[] {1,2,3,4,5};
		int[] arr2 = new int[] {5,4,3,2,1};
		int[] arr3 = new int[] {1,1};
		int[] arr4 = new int[] {-1,-2,0,1,2};		
		int[] arr5 = new int[] {1,2,3,0,1,2,3};
		int[] arr6 = new int[] {1};		
		
		System.out.println(findIndex(arr1));
		System.out.println(findIndex(arr2));
		System.out.println(findIndex(arr3));
		System.out.println(findIndex(arr4));
		System.out.println(findIndex(arr5));
		System.out.println(findIndex(arr6));

	}
	
	
	public static int findIndex(int[] array) {
		
		if (array.length < 2) {
			
			return -1;		
		}
		
		int hindex = array[0] > array[1] ? 0 : 1;
		int sindex = array[0] > array[1] ? 1 : 0;
		
		for (int i = 2; i < array.length; i++) {
			
			if (array[i] > array[hindex]) {
				
				sindex = hindex;
				hindex = i;
				
			} else if (array[i] > array[sindex] && array[i] != array[hindex]) {
				
				sindex = i;
			}
		}	
		
		return sindex;
		
	}

}
