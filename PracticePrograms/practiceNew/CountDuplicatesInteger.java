package practiceNew;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicatesInteger {

	public static void main(String[] args) {
		
		int[] array = new int[] {1,2,3,4,2,5,3,5};
		
		System.out.println(countDuplicates(array));

	}
	
	static int countDuplicates(int[] array) {
		
		int count = 0;
		
		Map<Integer, Integer> values = new HashMap<>();
		
		for (int i : array) {
			
			if (values.containsKey(i)) {
				
				values.put(i, values.get(i)+1);
								
			} else {
				values.put(i, 1);
			}		
		}
		
		for (Map.Entry<Integer, Integer> e : values.entrySet()) {
			
			if (e.getValue() > 1) {
				count += 1;
			}
		}
		
		return count;
		
	}
	

}
