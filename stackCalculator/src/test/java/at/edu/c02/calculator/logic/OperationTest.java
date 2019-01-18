package at.edu.c02.calculator.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import at.edu.c02.calculator.CalculatorException;
import at.edu.c02.calculator.MathOperation;
import at.edu.c02.calculator.logic.operations.Add;
import at.edu.c02.calculator.logic.operations.Mod;

public class OperationTest {

	@Test
	public void testAdd() throws CalculatorException {
		
		//setup
		MathOperation add = new Add();
		
		//execute
		double result = add.calculate(31, 47);
		
		//verify
		assertEquals(78, result, 0.0001);
		
	}
	
public void Mod() throws CalculatorException {
		
		//setup
		MathOperation mod = new Mod();
		
		double result = mod.calculate(20, 7);
		
		//verify
		assertEquals(6, result, 0.0001);
		
		
	
	}
	


	
}
