package day3;

public class reverseSplitString {

	public static void main(String[] args) {
		String test = "I am a software tester";
		   String[] word= test.split(" ");     //splitted using deleimeter
		   for(int i=0; i>word.length-1; i--){  //iteration happened
		       System.out.println(word[i]);     //DOUBT not printing 
		   } 
		}
	}


