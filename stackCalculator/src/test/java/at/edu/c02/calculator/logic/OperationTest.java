package at.edu.c02.calculator.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import at.edu.c02.calculator.CalculatorException;
import at.edu.c02.calculator.MathOperation;
import at.edu.c02.calculator.logic.operations.Add;

public class OperationTest {

	@Test
	public void testAdd() throws CalculatorException {
		
		//setup
		MathOperation add = new Add();
		
		//execute
		double result = add.calculate(30, 47);
		
		//verify
		assertEquals(77, result, 0.0001);
	}


	
}
