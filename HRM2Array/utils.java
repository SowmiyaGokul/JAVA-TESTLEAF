package HRM2Array;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class utils{
	
	
@DataProvider(name="login",indices= {1},parallel=true)
	
	
	
	public String[][] credentials() {
	
		String[][] data= new String[1][2];
		data[0][0]="Admin";
		data[0][1]="admin123";
		
		data[1][0]="ADMINSOWMIYA";
		data[1][1]="admin";
		
		return data;
		
		
	}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

