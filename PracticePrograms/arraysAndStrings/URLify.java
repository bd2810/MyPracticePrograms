/*
 * Write a method to replace all spaces in a string with '%20'. 
 * Assume string has sufficient space at end of string to hold additional characters, 
 * and that you're given a true length of a string. If implementing code in Java, 
 * please using a character array so that you can perform this operation in place.
 */

package arraysAndStrings;

public class URLify {

	public static void main(String[] args) {

		String string = "Mr John Smith   ";
		
		System.out.println(replaceSpaces(string));
	}
	
	// Method 1: Using String.trim and String.replaceAll
	public static String replaceSpaces(String str) {
		
		String result = null;		
		result = str.trim().replaceAll(" ", "%20");		
		return result;
	}
	
	// Method 2: Using StringBuilder and length = true length i.e. no leading and trailing white spaces
	public static String url(String string, int length) {
		
	    char[] arrays = string.toCharArray();
	    StringBuilder builder = new StringBuilder(length);

	    for (int i = 0; i < length; i++) {
	    	
	        if (arrays[i] == ' ') {
	            builder.append("%20");
	        } else {
	            builder.append(arrays[i]);
	        }
	    }

	    return builder.toString();
	}

}
