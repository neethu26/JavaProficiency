package Assignment_3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PalindromeTest {

	protected Palindrome p;
	@Before
	public void setUp() throws Exception {
	  this.p = new Palindrome();
	}

	@Test
	public void testGetReverseStringTrue() {
		assertTrue(this.p.getReverseString("121"));
	}
	
	@Test
	public void testGetReverseStringFalse() {
		assertFalse(this.p.getReverseString("James"));
	}	

}
