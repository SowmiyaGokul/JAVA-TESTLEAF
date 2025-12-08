package day3;

public class ChangeuppercaseOdd {

	public static void main(String[] args) {
		String name ="changeMe";
	    //String rev=name.toUpperCase();
	    //System.out.println(rev);
	char[] arr= name.toCharArray();
	for(int i = 0; i<arr.length; i++) {
	    if(i%2!=0){
	        
	        int chn=Character.toUpperCase(i);
	         System.out.println(chn);
	    }
	}

	}

}
