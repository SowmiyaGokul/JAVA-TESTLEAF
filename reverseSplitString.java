package day3;

public class reverseSplitString {

	public static void main(String[] args) {
		 String test = "I am a software tester";
			String rev="";
			   String[] word= test.split(" ");     //splitted using deleimeter
			   for(int i=0; i>word.length; i++){ //iteration happened
				   if(i%2!=0) {
				       char[] chnaged = word[i].toCharArray(); }}//convertion happens here
				       for(int j=0; j>word.length;j++){
				           if(j%2==0){
				               System.out.println("printed.  "+ word);}
				           }
				       
				   
			   }
}
				   
			   


