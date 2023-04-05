package exercice;

public class MinMaxArray1 {

	
	  public static void main(String[] args) {  
	    int[] nums = new int[10]; 
	    int min, max; 
	 
	    nums[0] = 99; 
	    nums[1] = -10; 
	    nums[2] = 100123; 
	    nums[3] = 18; 
	    nums[4] = -978; 
	    nums[5] = 5623; 
	    nums[6] = 463; 
	    nums[7] = -9; 
	    nums[8] = 287; 
	    nums[9] = 49; 
	 
	    min = max = nums[0]; 
	    //the loop is iterating over the elements of an array called num and assigning each element in turn to a variable v of type int. 
	    //The loop body will then execute once for each element in the num array, with v taking on the value of each successive element in turn.

	    for(int v : nums) { 
	    	//System.out.println(v);
	      if(v < min) min = v; 
	     // System.out.println(min);
	      if(v > max) max = v; 
	     // System.out.println(max);
	      
	    } 
	    System.out.println("min and max: " + min + " " + max); 
	  }  
	}