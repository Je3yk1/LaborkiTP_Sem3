package lista1;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class NumberTest {

Number liczba = null;
	
	@Before
	public void initialize(){
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
	
	@Test(timeout =100)
	public void testTime(){
		Number liczba2;
		int i=1;
		while(i>0 && i<100){
			liczba2 = new Number(i);
			assertNotNull(liczba2.printHex());
			i++;
		}
	}
	
	@Ignore
	@Test
	public void testFive() {
		
		String result = liczba.printOct();
		double r = Double.parseDouble(result);
		
		assertEquals(15.0, r, 1);
	}
	
	@After
	public void deleteNumber(){
		liczba = null;
	}
	@Ignore
	public void IgnoredMethodFromHeaven(){}
	
}
