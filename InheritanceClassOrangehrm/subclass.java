package orangehrm002;

public class subclass extends BaseClass {
	
 String user="sowmiya";
 String pwd ="alan";
 
	 public  void usern(String user) {
		 System.out.println(this.user);
		 
		 
	 }
	 public  void pwdn(String pwd){

	 System.out.println(this.pwd);
	 
	 
	 }
	 
	 public static void submit() {
		 System.out.println("click");
	 }
	public static void main(String[] args) {
		subclass sub=new subclass();
		sub.usern("");
		sub.pwdn("");
		sub.logopresent();
		sub.geturl();
		
		
	}
	
	
}
