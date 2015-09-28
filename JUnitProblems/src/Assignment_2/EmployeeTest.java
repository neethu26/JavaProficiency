package Assignment_2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

	protected Employee emp;
	
	@Before
	public void setUp() throws Exception {
	  emp = new Employee();
	
	}
    @Before
	public void before(){
		this.emp.addEmployee(326837, "Coder Neethu");
		this.emp.addEmployee(326396, "Expert Photography Person");
		this.emp.addEmployee(326280, "Normal Person");
	}
	
	@Test
	public void testGetEmployeeName() {
	  assertEquals("Coder Neethu",this.emp.getEmployeeName(326837));	
	}

}
