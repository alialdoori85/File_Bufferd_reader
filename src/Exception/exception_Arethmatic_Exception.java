package Exception;

public class exception_Arethmatic_Exception {

	public static void main(String[] args) {
		
		int x = 10 ;
		int y = 0 ;
	try {	
		System.out.println(x/y);
	
		
	}catch(ArithmeticException e ) {
	
		System.out.println(e);
	}
	System.out.println("try again ");
		
	}
	

}
