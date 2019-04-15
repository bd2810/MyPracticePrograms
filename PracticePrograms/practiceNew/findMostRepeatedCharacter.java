package practiceNew;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class findMostRepeatedCharacter {
	

	public static void main(String[] args) {
		
		findMostRepeatedCharacter mp = new findMostRepeatedCharacter();
		
		//System.out.println(mp.mostRepeatedCharacter("HHelllooo"));
		System.out.println(mostRepeatedCharacterWithoutMap("HHHHHHellllllllloooo"));
	}
	
//	public Character mostRepeatedCharacter (String str) {
//		
//		
//	}
	
	public static Character mostRepeatedCharacterWithoutMap (String str) {
		
		char[] chr = str.toCharArray();
		int count = 1;
		int tmp = 1;
		Arrays.sort(chr);
		
		char c = ' ';
		
		for (int i=1; i<chr.length; i++) {		
			
			if (chr[i] == chr[i-1]) {
				
				tmp++;
				
				if (count < tmp) {
					
					count = tmp;
					c = chr[i-1];
				}
				
			} else {
				
				
				
				tmp = 1;
				//i = i-1;
			}			
			
		}		
		
		return c;

	}

}
