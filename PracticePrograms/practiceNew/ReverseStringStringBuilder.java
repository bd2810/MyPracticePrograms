package practiceNew;


public class ReverseStringStringBuilder {

	public static void main(String[] args) {
		
		System.out.println(reverseString("BhavikDoshi"));

	}
	
	public static String reverseString (String str) {
		
		StringBuilder sb = new StringBuilder(str);
		
		String reverse = null;
		
		sb.reverse();
		
		reverse = sb.toString();
		
		return reverse;
		

	}

}
