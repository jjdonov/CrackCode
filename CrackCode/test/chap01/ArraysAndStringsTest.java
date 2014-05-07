package chap01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ArraysAndStringsTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testReverseCString() {
		String reverseMe = "John\\";
		assertEquals("nhoJ\\",ArraysAndStrings.reverseCString(reverseMe));
		reverseMe = "i\\";
		assertEquals(reverseMe, ArraysAndStrings.reverseCString(reverseMe));
		reverseMe = "ji\\";
		assertEquals("ij\\", ArraysAndStrings.reverseCString(reverseMe));
	}
	
	@Test
	public void testRotate90() {
		ArraysAndStrings.rotate90();
	}

}
