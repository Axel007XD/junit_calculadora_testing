package com.Axel;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
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
    public void testDivision2() {
        Calculadora calculadora = new Calculadora(3,3);
        double numeroA = calculadora.getA();
        double numeroB = calculadora.getB();
        if (numeroA<0 || numeroB<0) {
            throw new NullPointerException("El numero no puede ser negativo");
        }else{
            assertEquals(calculadora.dividir(numeroA,numeroB),1.0);
        }
    }
    @Test
    public void testAlertaDivision() {

            Calculadora calculadora = new Calculadora(3,5);

            double numeroA = calculadora.getA();
            double numeroB = calculadora.getB();


            double resultado = numeroA/numeroB;

            assertEquals((numeroA==0||numeroB==0),true);

    }


}