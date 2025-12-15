package Arrays;

import java.util.Arrays;

public class missingElement {

	public static void main(String[] args) {
		
		 int[] miss={1,4,3,2,8,6,7}; 
		 Arrays.sort(miss);

	        // Compare each number with the next
	        for (int i = 0; i < miss.length - 1; i++) {
             if (miss[i + 1] != miss[i] + 1) {

	  //  Print the missing number
	                System.out.println(miss[i] + 1);
	                break;
	            }
	        }
	    }
		
}
/*
Requirements: - Create a Java class named FindMissingElement. 
- Add a main method in the FindMissingElement class, either by typing it or using a shortcut
(Type main, ctrl+space & Enter). 
- Inside the main method, write java code to print Missing Number in the console.
 - Save the code and run the program (right-click -> Run as -> Java Application).
Hints to Solve:
• Sort the array
• Loop through the array (start i from arr[0] till the length of the array)
• Check if the iterator variable is not equal to the array values respectively
• Print the number
• Once printed break the iteration 
*/

