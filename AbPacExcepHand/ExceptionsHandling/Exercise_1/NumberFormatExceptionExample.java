import java.lang.*;


public class NumberFormatExceptionExample  {

	public void checkType(String number) throws NumberFormatException {
		if ( new Integer(Integer.parseInt(number))  instanceof Integer)
			System.out.println("Hurray it converted into integer");
		else
			throw new NumberFormatException("Hurray Not  converted into integer");
	
	}

	
	public static void main(String[] args) {
		
		NumberFormatExceptionExample object = new NumberFormatExceptionExample();
		try {			
			object.checkType(args[0]);
		}catch(NumberFormatException e) {
			System.out.println("Not converted into integer dear");
		}
	}
}