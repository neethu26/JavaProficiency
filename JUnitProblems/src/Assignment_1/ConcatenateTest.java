package Assignment_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConcatenateTest {

	Concatenate con;
	@Before
	public void setUp(){
		con = new Concatenate();
	}
	
	@Test
	public void testStringConcat() {
		assertEquals("James Hello","JamesJohnson",con.stringConcat("James", "Johnson"));
	}

}
