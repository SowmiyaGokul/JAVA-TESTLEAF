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
		
		
		
		
		
		

	}

}
