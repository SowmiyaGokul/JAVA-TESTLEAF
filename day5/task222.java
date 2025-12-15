package day5;

public class task222 {

	public static void main(String[] args) {
		String empty=" ";
		String rev="";
		empty=empty.toLowerCase();
		empty=empty.replaceAll("[a-z0-9]", rev);
		for(int i=empty.length()-1; i>=0; i--) 
		{
			rev=rev+empty.charAt(i);
		}
		System.out.println(rev);

	
	if(empty.equals(rev)){
		System.out.println("yes its same");
	}
	else {
		System.out.println("no");
	}
}
}

