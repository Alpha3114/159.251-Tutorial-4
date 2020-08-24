import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalcTest{
	
	@Test
	void AddTest(){
		assertEquals(Calc.add(4,3), 7);
	}
	
	@Test
	void SubtractTest(){
		assertEquals(Calc.subtract(4,3), 1);
	}
	
}