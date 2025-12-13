package day5;

public class task3 {

	public static void main(String[] args) {
		String indexnum = "javA programming";
		int count=0;
		for(int i=0; i<indexnum.length(); i++) {
			char ch=indexnum.charAt(i);
			
			if(indexnum.charAt(i)=='a' || indexnum.charAt(i)=='A' )
			{
				System.out.println(  ch + " at place " + i);
			}
			if (indexnum.charAt(i)==' '){
				System.out.println(i + "  space");
				
					
			}
			
			
			
			
		}


		                        //given task
		java 3/20 

(Print all indexes of 'a')

Given a string s, print the index of every occurrence of the letter 'a'.

Example:

Input: s = "java programming"

Explanation:
The string has characters at these positions:
0 - j
1 - a
2 - v
3 - a
4 - (space)
5 - p
6 - r
7 - o
8 - g
9 - r
10 - a
11 - m
12 - m
13 - i
14 - n
15 - g

The letter 'a' appears on the indexes 1, 3, and 10.
These are the indexes you must print.

Output:
1
3
	10
		
		
		
		
		

	}

}
