import java.lang.*;
import java.util.*;

class NumberAndArrayOutOfBoundException {

	public static void main(String[] args){
		
		try {
			
			Scanner scan = new Scanner(System.in);
			int[] array = new  int[Integer.parseInt(args[0])];
			
            try {
				
				for(int i = 1 ; i < array.length; i++) {
					 Integer.parseInt(args[i]);			
				}
			
			}catch(NumberFormatException e) {
				System.out.println("Caught Number Format Exception");		
			}
		    			
			
			System.out.println(array[array.length + 1]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(" Caught Array index out of bounds exception ");		
		}finally {
			System.out.println("Hurray all the exceptions caught");
		}
			
	}
}