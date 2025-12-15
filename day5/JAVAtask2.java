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

}
