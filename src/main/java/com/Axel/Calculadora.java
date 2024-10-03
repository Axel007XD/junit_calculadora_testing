package com.Axel;

public class Calculadora {

    private Long a;
    private Long b;

    public Calculadora() {
    }
    public Calculadora(Long a, Long b) {
        this.a = a;
        this.b = b;
    }


    public double sumar(double a, double b) {
        return a + b;
    }

    // Método para restar dos números
    public double restar(double a, double b) {
        return a - b;
    }

    // Método para multiplicar dos números
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para dividir dos números
    public double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("No se puede dividir por cero");
        }
    }

}
