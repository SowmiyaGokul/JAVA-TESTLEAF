package day4;

public class lastwordstring3 {

	public static void main(String[] args) {
		
		String Cool = "luffy is still joyboy";
		int count =0;
		for(int i=Cool.length()-1; i>0; i--) {
			if(Cool.charAt(i)==' ') {
				break;
				
			}
			count++;}
		
			System.out.print("length of 3rd example  =" + count);
		}
	

}
