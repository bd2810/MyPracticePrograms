

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
	
	public static void main(String[] args) {
		
		long startTime = System.nanoTime();		
		
		int[] array = {-1,0,1,2,1,3,-2,-1,1,0};		
		
		System.out.println(three(array));
		
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;		// just calculating the time to run this program
		System.out.println(totalTime);
	}
	
	// First method - Brute Force. Time complexity = O(n^3)
	
	public static List<List<Integer>> threeSum(int[] array) {
		
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		
		if (array == null || array.length < 3) {
            return list;
        }				
		
		int count = 0;
		
		for (int i=0; i<array.length; i++) {
			
			for (int j=i+1; j<array.length; j++) {
				
				for (int k=i+2; k<array.length; k++) {
					
					count++;
					
					if ((i != j) && (j != k) && (i != k)) {
						
						if (array[i]+array[j]+array[k] == 0) {
							
							List<Integer> subList = new ArrayList<Integer>();
							
							subList.add(array[i]);
							subList.add(array[j]);
							subList.add(array[k]);
							
							Collections.sort(subList);
							
							if (!list.contains(subList)) {
								
								list.add(subList);
							}	
						}
						
					}
					
										
				}
			}
		}
		
		System.out.println(count);
		return list;		
		
	}
	
	
	// Second method optimized. Time complexity = O(n^2)
	public static List<List<Integer>> three(int[] num) {
		
	    Arrays.sort(num);
	    System.out.println(Arrays.toString(num));
	    
	    List<List<Integer>> res = new LinkedList<>(); 
	    
	    for (int i = 0; i < num.length-2; i++) {  //num.length - 2 -- because i will need at least two elements after it for summation
	    	
	        if (i == 0 || (i > 0 && num[i] != num[i-1])) {  // num[i] != num[i-1] to skip same values
	        	
	            int lo = i+1, hi = num.length-1, sum = 0 - num[i];
	            
	            while (lo < hi) {		// basically for each i element, it will travserse from i+1 to end of array
	            	
	                if (num[lo] + num[hi] == sum) {					// i.e. num[i]+num[lo]+num[hi] = 0;
	                	
	                    res.add(Arrays.asList(num[i], num[lo], num[hi]));
	                    
	                    while (lo < hi && num[lo] == num[lo+1]) {			// skip same values
	                    	
	                    	lo++;
	                    }
	                    
	                    while (lo < hi && num[hi] == num[hi-1]) { 			// skip same values
	                    	
	                    	hi--;
	                    }
	                    
	                    lo++; 
	                    hi--;
	                    
	                } else if (num[lo] + num[hi] < sum) { 
	                	
	                	lo++;
	                }
	                
	                else { 
	                	hi--;
	                }
	           }
	        }
	    }
	    
	    return res;
	}
	
}
