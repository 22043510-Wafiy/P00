import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator(); //Assign a variable called "cal" to use the Calculator class
		int actual = cal.add(a, b); //store the result into variable "actual"
		
		int expected = 9999;
		assertEquals(expected, actual);
		
	}
	
	@Test
	public final void testSubtract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		assertEquals(actual,expected);
	}
	
	@Test
	public final void testMultiple() {
		int a = 43;
		int b = 34;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		
		int expected = 1462;
		assertEquals(actual,expected);
		
	}
	
	@Test
	public final void testDivide() {
		int a = 40;
		int b = 10;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 4;
		assertEquals(actual,expected);
	}

}
