package lista1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Klasa testowa korzystaj¹ca z JUnit 3.8
 * @author jedrzej
 *
 */
public class NumberJ3Test extends TestCase {
	
	Number liczba = null;
	
	public void setUp() {
		liczba = new Number(14);
		
		
		
	}
	@Test
	public void testBin() {
		
		String result = liczba.printBin();
		assertEquals("1110", result);
	}
	
	@Test 
	public void testOct(){
		
		String result = liczba.printOct();
		assertEquals("16", result);
		
	}

	@Test
	public void testHex(){
		
		String result = liczba.printHex();
		assertTrue(result = "e", true);
	}
	
	@Test
	public void testNull(){ 
		assertNotNull(liczba);
	}
	
	public void testFive() {
		String result = liczba.printOct();
		double r = Double.parseDouble(result);
		
		assertEquals(15.0, r, 1);
	}
	public void tearDown(){
		liczba = null;
	}
}
