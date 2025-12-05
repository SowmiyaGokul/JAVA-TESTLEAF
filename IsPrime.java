package day2;

public class IsPrime {

	public static void main(String[] args) {
		
		
int prime = 48;
int count = 0;
for (int i = 1; i <= prime; i++) {
	if (prime % i == 0) {
		count++;
		}
	 }

if (count == 2) {
 System.out.println(prime + " is prime");
} 
else {
	System.out.println(prime + " is not prime");
		        }
		    }
		}

		    
		
		
		
		

	


