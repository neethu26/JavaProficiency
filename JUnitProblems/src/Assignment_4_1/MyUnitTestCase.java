package Assignment_4_1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;

import java.util.Stack;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyUnitTestCase {

	 static Stack<Integer> stack;
	 static Integer[] array;
	 static Integer[] copyArray;
	 
	 @BeforeClass
	 public static void oneTimeSetUp() {
	  //Initialization code goes here
	  System.out.println
	            ("Inside the @BeforeClass function");
	  stack = new Stack<Integer>();
	  array=new Integer[]{1,0,1};
	  copyArray=new Integer[3];
	}
	 
	 @Test
	 public void testStackAddItems() {
	  System.out.println("Inside testStackAddItems() ");
	  
	   for(Integer temp:array){
	    stack.push(temp);
	   }
	  
	   assertEquals(3, stack.size());
	 }
	 
	 
	 @Test
	 public void testStackRemoveAllItems() {
	  
	   System.out.println("Inside testStackRemoveAllItems() ");
	   int k = stack.size();
	  	  
	   for(int i=0;i < k; i++){
	     copyArray[i]=stack.pop();
	     System.out.println(" popped element = "+stack.pop());
	   }
	  
	   assertTrue(stack.isEmpty());
	   assertArrayEquals(array, copyArray);
	 
	 }
	 
}	
	

