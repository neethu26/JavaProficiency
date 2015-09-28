package Assignment_5_1_1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.*;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {

	PrimeNumberChecker n;
	
	
	protected Integer inputNumber ;
	protected Boolean expectedResult;
	
	public PrimeNumberCheckerTest(Integer a,Boolean value){
	  this.inputNumber = a;
	  this.expectedResult = value;
	}
	
	@Before	
	public  void setUp() throws Exception {
	  n = new PrimeNumberChecker();	 
	}
	

	@Parameters
	public static Collection<Object[]> generateData(){
		
		return Arrays.asList(
				
			new Object[][]{
				{2,true},
				{19,true},
				{23,true},
				{111,false},
				{16,false},
				{122,false},
				{100,false},
				{1125,false}
			}	
		);
	
	}
	
	@Test
	public void testValidate() {		
		assertEquals(expectedResult,n.validate(inputNumber));
		
	}

}
