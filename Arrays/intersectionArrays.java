package Arrays;

public class intersectionArrays {

	public static void main(String[] args) {
	
		int a[]={3,2,11,4,6,7};
		 int b[]= {1,2,8,4,9,7}; 
		
		
		 for(int i=a.length-1; i>=0;i--){
		     for(int j=b.length-1; j>=0; j--){
		         if (a[i]==b[j]){
		             System.out.println(b[j]);
		         }
		     }
		 }
	}}
/*
Declare An array for {3,2,11,4,6,7};
Declare another array for {1,2,8,4,9,7}; 
- Declare for loop iterator from 0 to array length 
Declare a nested for another array from 0 to array length 
- Compare both the arrays using a conditional statement. 
Print the value from first array when there is a match */