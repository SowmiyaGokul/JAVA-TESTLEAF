package day2;

public class FibonacciSeries {
	
	
	public static void main(String[] args) {
		  int n1=0;
	         int n2= 1;
	         int sum =0; //mentioned first 2 values
	         System.out.println(n1 +" " +n2); //printing first 2 natural numbers
	         for(int i =2; i<=8; i++)
	         //gave range upto8
	         {
	             sum=n1+n2; //adding first 2 numbers to get third value
	             System.out.println(" " +sum); //printing that number 
	             n1=n2;
	             n2=sum;
	         }
	         
	    }
	    
	
	}


