package day5;

public class JAVAtask2 {

	public static void main(String[] args) {

String sentence= "A man, a plan, a canal: Panama";
sentence=sentence.trim();
  String rev="";
 sentence=sentence.toLowerCase();
  sentence = sentence.replaceAll("[^a-z0-9]", "");
   for(int i=sentence.length()-1; i>=0; i--) 
   {
	   
	   
	   rev= rev+sentence.charAt(i);
	   
	   }
   
   System.out.println(rev);

if(sentence.equals(rev)) {
	System.out.println("ITS SAME");
}
else {
	System.out.println("Its not same ");
}
	}


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

}
