package com.ingjuanfg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void suma(){
        Calculadora calculadora = new Calculadora();
        assertEquals(8, calculadora.suma(5,1));
    }
}
