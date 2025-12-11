package day3;

public class reverseSplitString {

	public class reverseSplit {

	public static void main(String[] args) {
		
		  String text = "We learn Java basics as part of java sessions in java week1";
		   int  count=0;
		   String [] divide=text. split(" ");
		   for(int i =0; i<text.length()-1; i++){
		       for(int j=0;j<text.length()-1; j++){
		           if(divide[i].equals(divide[j])){
		              //divide[j]=" ";
		               
		           }
		            System.out.println("done   = "+ divide );
		            count++;
		       }
		       
		   }
		}
		
		
		
		
	}


