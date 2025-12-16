package orangehrm002;

public class BaseClass {
	
	public static void logopresent(){
		System.out.println("logoDispalyed");
		
	}
	
	public static void geturl() {
		System.out.println("url Received");
		
	}
	
	
	
public static void main(String[] args) {
	  BaseClass base= new BaseClass();
	  base.logopresent();
	  base.geturl();
	
	
	
}
}
