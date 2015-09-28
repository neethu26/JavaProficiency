package Assignment_5_1_2;

import Assignment_5_1_1.PrimeNumberChecker;
import Assignment_5_1_1.PrimeNumberCheckerTest;
import Assignment_1.Concatenate;
import Assignment_1.ConcatenateTest;
import Assignment_3.Palindrome;
import Assignment_3.PalindromeTestNew;
import Assignment_4_1.MyUnitTestCaseTest;


import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Parameterized.Parameters;

import Assignment_2.Employee;
import Assignment_2.EmployeeTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
PrimeNumberCheckerTest.class,
EmployeeTest.class,
ConcatenateTest.class,
PalindromeTestNew.class,
MyUnitTestCaseTest.class
})

public class JUnitTestSuite {

    protected Employee emp;
    PrimeNumberChecker n;
	protected Integer inputNumber ;
	protected Boolean expectedResult;
    protected Concatenate con;
    protected Palindrome p;
    
	public JUnitTestSuite(Integer a,Boolean value){
	  this.inputNumber = a;
	  this.expectedResult = value;
	}
        
	@Before
	public void setUp() throws Exception {
	  emp = new Employee();
	  n = new PrimeNumberChecker();
	  con = new Concatenate(); 
	  p = new Palindrome();
	}
	
	@Before
	public void before(){
		this.emp.addEmployee(326837, "Coder Neethu");
		this.emp.addEmployee(326396, "Expert Photography Person");
		this.emp.addEmployee(326280, "Normal Person");
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

	@Test
	public void testGetEmployeeName() {
	  assertEquals("Coder Neethu",emp.getEmployeeName(326837));	
	}
	
	@Test
	public void testGetReverseString() {
		assertEquals(true,p.getReverseString("121"));
	}	
	
    
	@Test
	public void testStringConcat() {
		assertEquals("James Hello","JamesJohnson",con.stringConcat("James", "Johnson"));
	}

}
