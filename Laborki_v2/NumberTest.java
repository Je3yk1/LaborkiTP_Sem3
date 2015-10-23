package lista1;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Klasa testowa korzystaj¹ca z JUnit 4
 * @author jedrzej
 *
 */
public class NumberTest {

	Number liczba = null;
	
	@Before
	public void setUp(){
		try{
		liczba = new Number(14);}
		catch(NumberException x){}
	}
	
	@Test(expected = NumberException.class)
	public void testNumb() throws NumberException{
		liczba = new Number(-1);
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
	
	@Test(expected = NumberFormatException.class)
	public void testException(){
		try{
		Number liczba = new Number(Integer.parseInt("aa"));
		}
		catch(NumberException ex){}
	}
	
	@Test(timeout= 100)
	public void testTime(){
		int i = 1;
		
		while(i>0){
			
			assertEquals("e", liczba.printHex());
			i++;
		}
	}

	@Ignore("Test is ignored") 
	@Test
	public void testNull(){
		assertNull(liczba);
	}
	
	
	@After
	public void tearDown(){
		liczba = null;
		
	}
}
