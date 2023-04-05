package exercice;
// Demonstrate the Bubble sort with numbers
public class SortingArrayy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



    int nrs[] = {100, -356, -9089, 112, 78, 66, 345, -564
                    }; 
    //We will use a temporary variable for swapping the values
    int a, b, t; 
   
    int size;
    
   
    size = nrs.length; // number of elements to sort   
   
    // display original array   
   System.out.println("Original array is:");  
    for(int i=0; i < size; i++)  
	
		System.out.print(" "+ nrs[i]);
		System.out.println();

    


    // This is the bubble sort;  
		//The first for will start a having the of size of the array -1 (the arrays start from 0)
		//We will de decrement a for each iteration . In our case we will start with a having 7 value
    for(a=size-1; a >0; a--)   {
    	//For the inner for we will start from 0 and we will compare each number with his successor.
    	//For b on the 0 position we will compare if the value it's bigger than the value of his successor
    	//When if is validated with true, the temporary variable will have the current variable value, the current variable will have his successor value
    	//and then his successor will have the temporary value.
      for(b=0; b<a; b++) {  
    	  
        if(nrs[b]  > nrs[b+1]) { // if out of order   
          // exchange elements    
         t = nrs[b];   
          
          nrs[b] = nrs[b+1];  
     
          nrs[b+1] = t;   
          
         //System.out.println(nrs[a]);
        } 
        //System.out.println("cccc "+ nrs[b]);
      }   
    }
    // display sorted array   
    System.out.print("Sorted array is:");   
    for(int i=0; i < size; i++)  
      System.out.print(" " + nrs[i]);   
    System.out.println();  
  }  
}
