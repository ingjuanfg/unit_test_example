package com.ingjuanfg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculatorTest {

    @Test
    public void testSumarDosEnterosExitosamente(){
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.suma(1,5));
    }

    @Test
    public void testSumarDosEnterosFallida(){
        Calculator calculator = new Calculator();
        assertNotEquals(8, calculator.suma(1,2));
    }
    
    @Test
    public void testSumarTresEnterosFallida(){
        Calculator calculator = new Calculator();
        assertNotEquals(8, calculator.suma(1,2));
    }
}
