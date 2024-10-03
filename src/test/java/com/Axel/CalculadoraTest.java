package com.Axel;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class CalculadoraTest extends TestCase {

    @Test
    public void testSuma() {
        Calculadora calculadora = new Calculadora();
        assertEquals(calculadora.sumar(3,3),6.0);
    }
    @Test
    public void testResta() {
        Calculadora calculadora = new Calculadora();
        assertEquals(calculadora.restar(3,3),0.0);
    }

    @Test
    public void testMultiplicacion() {
        Calculadora calculadora = new Calculadora();
        assertEquals(calculadora.multiplicar(3,3),9.0);
    }
    @Test
    public void testDivision() {
        Calculadora calculadora = new Calculadora();
        assertEquals(calculadora.dividir(3,3),1.0);
    }
  
}