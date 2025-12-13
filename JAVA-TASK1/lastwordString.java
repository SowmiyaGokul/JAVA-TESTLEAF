package day4;

import java.util.Arrays;

public class lastwordString {

	public static void main(String[] args) {
		 String ex1= "Hello World";
		 
		
		 int count=0;
		 
    for(int i=ex1.length()-1; i>=0; i--){
    	if (ex1.charAt(i) == ' ') {
            break;
    	}
    	count++;
    	}
        	 System.out.println("length of last word  = " +count); }}

    
     


                                            //given task
Java Challenge (1/20)
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.

	

       
       
