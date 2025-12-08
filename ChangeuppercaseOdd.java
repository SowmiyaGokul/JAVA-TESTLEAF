package day3;

public class ChangeuppercaseOdd {

	public static void main(String[] args) {
		String name ="changeMe";
	    //String rev=name.toUpperCase();
	    //System.out.println(rev);
	char[] arr= name.toCharArray();  //convert to array
	for(int i = 0; i<arr.length; i++) {  //intro iteration
	    if(i%2!=0){                      //checking odd place through for loop
	        
	        int chn=Character.toUpperCase(i);  //change to uppercase with stored in int data type
	         System.out.println(chn);     //DOUBT** only position diplaying
	    } 
	}

	}

}
