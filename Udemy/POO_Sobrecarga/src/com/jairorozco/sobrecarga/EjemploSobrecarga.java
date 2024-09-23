package com.jairorozco.sobrecarga;

import static com.jairorozco.sobrecarga.Calculadora.sumar;

public class EjemploSobrecarga {
    public static void main(String[] args) {

        System.out.println("Sumar enteros: " + sumar(10, 5));
        System.out.println("Sumar float: " + sumar(30.0f, 3.45f));
        System.out.println("Sumar float-int: " + Calculadora.sumar(10.0f, 5));
        System.out.println("Sumar int-float: " + Calculadora.sumar(5, 5.34f));

    }
}
