/*
 * Given a list of Strings, merge all the Strings in a single string in a sorted order.
 * Input: ["acb", "dab", "hcd"]
 * Output: "aabbccddh"
 */


import java.util.Arrays;
import java.util.List;

public class MergeAndSortStrings {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("acb", "dab", "hcd");
		
		System.out.println(mergeAndSort(list));
	}
	
		
	public static String mergeAndSort (List<String> list) {
		
		String finalString = null;
		
		StringBuilder sBuilder = new StringBuilder();
		
		for (int i=0; i<list.size(); i++) {
			
			sBuilder.append(list.get(i));
			
		}
		
		String str = sBuilder.toString();
		
		char[] ch = str.toCharArray();
		
		Arrays.sort(ch);
		
		finalString = String.valueOf(ch);
				
		return finalString;
	}

}
