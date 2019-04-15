package practiceNew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class cheatSheet {
	
	public static void main(String[] args) {
		
		// Arrays
		int[] numbers = new int[5];
		numbers[0] = 10;
		System.out.println("numbers are: " + numbers);
		
		int[] data1 = {10,20,30,40,50};
		data1.toString();
		System.out.println("data is: " + data1);
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		int len = cars.length;
		System.out.println("Length of cars is: " + len);
		
		String str = "HelloWorld";
		char[] chrArray = str.toCharArray();
		
		char[] chrArray2 = {'H', 'e', 'l', 'l', 'o'};
		
		
		// ArrayLists
		ArrayList<String> cars2 = new ArrayList<String>();
	    cars2.add("Volvo");
	    cars2.add("BMW");
	    int size = cars2.size();
	    cars2.remove(0);
	    
	    ArrayList<String> days = new ArrayList<String>(Arrays.asList("Mon", "Tue", "Wed"));
	    days.add("Thu");
	    days.contains("Tue");
	    
	    //HashMaps
	    
	    Map<String, String> data = new HashMap<>();
	    data.get("key");
	    data.put("key", "value");
	    data.containsKey("key");
	    data.remove("key");
	    data.remove("key", "value");
	    data.size();
	    data.values();
	    data.keySet();
	    data.entrySet(); 	// key, value set

		
		
		
	}
	
	
	
	
	
	

}
