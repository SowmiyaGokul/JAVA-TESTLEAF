package day3;

public class reverseSplitString {

	public class reverseSplit {

	public class reverseSplit {

	public static void main(String[] args) {
		
		  String text = "We learn Java basics as part of java sessions in java week1";
		  
		   String [] divide=text. split(" "); //convert string to array
		   for(int i =0; i<divide.length-1; i++){
			                                        //intro of 2 loops to compare each and every word
		       for(int j=0;j<divide.length-1; j++){
		    	   
		           if(divide[i].equals(divide[j])){
		              divide[j]=" ";           //comparing
		               
		           }
		            System.out.println("done   = "+ Arrays.toString(divide) );
		                                                                        //printing array again to string
		       }
		       
		   }
		}
		
		
		
		
	}
