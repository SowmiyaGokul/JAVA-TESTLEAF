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

    
       

	

       
       
