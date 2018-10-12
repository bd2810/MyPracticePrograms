package General;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class DefineDataStructures {
	
	@Test
	public void testArrayList() {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("ArrayList - first");
		list.add("ArrayList - second");
		list.add("ArrayList - second");
		list.add("ArrayList - third");
		list.add("ArrayList - forth");
		list.add("ArrayList - fifth");
		System.out.println(list);
		list.remove(0);
		System.out.println("remove with index list: "+list);
		list.remove("ArrayList - second");
		System.out.println("remove with object: "+list);
		System.out.println(list.size());
		System.out.println(list.contains("ArrayList - fifth"));
		System.out.println(list.toString());
		list.clear();
		System.out.println("final list is: "+list);
	}
	
	@Test
	public void testList() {
		
		Map<Integer, List<Integer>> newList = new HashMap<Integer, List<Integer>>();
		
		List<String> list = new ArrayList<String>();
		list.add("List - first");
		list.add("List - second");
		list.add("List - second");
		list.add("List - third");
		list.add("List - forth");
		list.add("List - fifth");
		System.out.println(list);
		list.remove(0);
		System.out.println("remove with index list: "+list);
		list.remove("List - second");
		System.out.println("remove with object: "+list);
		System.out.println(list.size());
		System.out.println(list.contains("List - fifth"));
		System.out.println(list.toString());
		list.clear();
		System.out.println("final list is: "+list);
	}
	
	@Test
	public void testHashSet() {
		
		HashSet<String> list = new HashSet<String>();
		list.add("ArrayList - first");
		list.add("ArrayList - second");
		list.add("ArrayList - second");
		list.add("ArrayList - third");
		list.add("ArrayList - forth");
		list.add("ArrayList - fifth");
		System.out.println(list);
		list.remove(0);
		System.out.println("remove with index list: "+list);
		list.remove("ArrayList - second");
		System.out.println("remove with object: "+list);
		System.out.println(list.size());
		System.out.println(list.contains("ArrayList - fifth"));
		System.out.println(list.toString());
		list.clear();
		System.out.println("final list is: "+list);
		
	}
	
	@Test
	public void testIntegerArray() {	
		
		int[] arr;		//define int array
		int[] arr1 = new int[5];	// define and initialize array
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		arr1[4] = 5;
		
		int[] array = new int[] { 2,6,13,21,36,47,63,81,97 };	//define, initialize and populate array
		
		
	}

	@Test
	public void testStringArray() {		
		
		String[] arr;		//define int array
		String[] arr1 = new String[2];	// define and initialize array
		arr1[0] = "a";
		arr1[1] = "b";		
		
		String[] array = new String[] { "a", "b" };	//define, initialize and populate array
		
		
	}

	
	
	@Test
	public void testCharacterrArray() {	
		
		char[] array = new char[] { 'a',6,13 };
		
		
	}
	
	@Test
	public void testReplaceAll() {	
		
		String text = "This - text123 ! has \\ /55a lot # of %00 sp3ecial %  characters";
		text = text.replaceAll("[^a-zA-Z\\s+]", "");		// will replace all characters which are not letters or space
		System.out.println(text);
	
	}
	
	
	@Test
	public void testHashMapIterator() {	
		
		char[] chr = "HelloWorld".toCharArray();

		Map<Character, Integer> repetitions = new HashMap<Character, Integer>();

		for (int i = 0; i < chr.length; i++) {

			if (repetitions.containsKey(chr[i])) {

				repetitions.put(chr[i], repetitions.get(chr[i]) + 1);

			} else {

				repetitions.put(chr[i], 1);
			}
		}

		System.out.println(repetitions);
		
		Hashtable<Character, Integer> tables = new Hashtable<Character, Integer>();

		for (int i = 0; i < chr.length; i++) {

			if (tables.containsKey(chr[i])) {

				tables.put(chr[i], tables.get(chr[i]) + 1);

			} else {

				tables.put(chr[i], 1);
			}
		}

		System.out.println(tables);
		

	}
		
	
	
}
