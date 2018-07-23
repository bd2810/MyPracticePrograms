package arraysAndStrings;


public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		
		String string = "abcddc";
		
		System.out.println(palindromeString(string));

	}
	
	public static String palindromeString (String string) {
		
		String result = "";
		
		String subString = "";
		String revereString = "";
		
		char[] chr = string.toCharArray();
		
		for (int i=0; i<chr.length-1; i++) {
			
			for (int j=i+1; j<chr.length; j++) {
				
				StringBuilder sb = new StringBuilder();
				
				for (int k=i; k<=j; k++) {		
					
					sb.append(chr[k]);				
				}	
				
				subString = sb.toString();
				revereString = sb.reverse().toString();	
				
				if (subString.equals(revereString)) {
					
					if (result.length() < subString.length()) {
						
						result = subString;
					}
				}					
			}				
		}	
		
		if (result == "") {
			
			result = Character.toString(string.charAt(0));	
		}
		
		return result;
	}

}
