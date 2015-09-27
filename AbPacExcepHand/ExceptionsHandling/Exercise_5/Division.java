import java.lang.*;

class Division {

     public int division (int a, int b) throws ArithmeticException {
		
		if((b < 1)) 
			throw new ArithmeticException("Division by error");
		return  (a/b);
	 }
    

	public static void main(String[] args)  throws ArithmeticException {
				
			Division d = new Division();
			try {
				d.division(2,0);
			}catch(ArithmeticException e) {
				System.out.println("Division by zero error");
			}
	
	}

}