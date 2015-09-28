package Assignment_3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PalindromeTestNew {

	protected Palindrome p;
	@Before
	public void setUp() throws Exception {
	  this.p = new Palindrome();
	}

	@Test
	public void testGetReverseString() {
		assertEquals(true,this.p.getReverseString("121"));
	}
	
}
