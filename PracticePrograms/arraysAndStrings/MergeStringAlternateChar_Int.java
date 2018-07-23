/* Shutterfly
 * 
 * Program to merge two string taking alternate characters from each strings
 * e.g. Strings 'Pineapple' and 'Test' ---> 'PTiensetapple'
 * e.g. Strings 'Hello' and 'World' ---> 'HWeolrllod'
 * e.g. Strings 'Test' and 'Pineapple' ---> 'TPeisnteapple'
 */

package arraysAndStrings;

public class MergeStringAlternateChar_Int {

	public static void main(String[] args) {
		
		String a = "Test";
		String b = "Pineapple";
				
		System.out.println("New string is: " +mergeStrings(a, b));

	}
	
	public static String mergeStrings(String a, String b) {
		
		String result = "";
		
		int i = 0;
		
		while (i < a.length() && i < b.length()) {
			
			result += a.charAt(i);
			result += b.charAt(i);
			i++;
		}
		
		if (a.length() > b.length()) {
			
			while (i < a.length()) {
				result += a.charAt(i);
				i++;
			}		
			
		} else if (a.length() < b.length()) {
			
			while (i < b.length()) {
				result += b.charAt(i);
				i++;
			}
			
		} else {
			return result;
		}
		
		return result;
	}

}
