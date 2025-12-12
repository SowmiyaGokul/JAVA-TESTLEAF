package day4;

public class lastwordstring2 {

	public static void main(String[] args) {
		  String ex2="fly me   to   the moon";
	       
int count=0;
for(int i=ex2.length()-1; i>=0;i--) {
	
	if (ex2.charAt(i)==' ') {
		break;
	}
	count++;}
	System.out.println("length of2nd example  = " +count);
	
	




	}

}
