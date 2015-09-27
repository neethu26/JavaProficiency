import java.lang.*;
import java.util.*;


class ArrayIndex {

	public static void main(String[] args){
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter The No Of Arguments ");
			int[] array = new  int[Integer.parseInt(args[0])];
			
			System.out.println("Enter the Elements");
			
			for(int i = 0 ; i < array.length; i++) {
				array[i] =  scan.nextInt();			
			}
		 
			System.out.println(array[array.length + 1]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}finally {
			System.out.println("Hurray it exception caught");
		}
			
	}


}

