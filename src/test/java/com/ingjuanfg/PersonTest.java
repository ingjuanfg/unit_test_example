package com.ingjuanfg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void sumaEntreDosNumerosExitosaTest(){
        Calculadora calculadora = new Calculadora();
        assertEquals(6, calculadora.suma(5,1));
    }

    @Test
    public void sumaEntreDosNumerosFallidaTest(){
        Calculadora calculadora = new Calculadora();
        Assertions.assertNotEquals(8, calculadora.suma(5,1));
    }
}
