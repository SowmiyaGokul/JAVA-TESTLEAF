package day5;

public class task22 {

	public static void main(String[] args) {
		String sentence2 = "race a car";
		String rev="";
				
		sentence2.trim();
		sentence2=sentence2.toUpperCase();
		sentence2=sentence2.replaceAll("[^A-Z0-9]", "");
        for(int i=sentence2.length()-1; i>=0; i--) 
        {
        	rev=rev+sentence2.charAt(i);
        	
        }
		System.out.println(rev);
		
	
if(sentence2.equals(rev)) {
	System.out.println("yes same ");
}
else {
	System.out.println("NO");}
}
}
