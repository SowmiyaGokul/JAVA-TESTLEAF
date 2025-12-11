package day3;

public class ChangeuppercaseOdd {

	public static void main(String[] args) {
       String test = "changeme"; 
       //String rev=name.toUpperCase();
	    //System.out.println(rev);
  char[] neww=test.toCharArray();  //convert to array
  
  for(int i=0; i<neww.length; i++){
      if (i%2!=0){
         neww[i]=Character.toUpperCase(neww[i]);
         // convert it to upper case 
      }
      
  }
      System.out.println("changed--> " + neww );
 //char result1=Character.toLowerCase(ch[i]);
    }
}
