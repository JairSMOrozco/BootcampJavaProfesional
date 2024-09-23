package com.jairorozco.sobrecarga;

public class Calculadora {
    //Atributos


    public static int sumar(int a, int b){
        return a+b;
    }

    public static float sumar(float a, float b){
        return a+b;
    }

    public static float sumar(int a, float j){
        return a+j;
    }

    public static float sumar(float a, int j){
        return a+j;
    }

    public static double sumar(double a, double b){
        return a+b;
    }

    public static int sumar(String a, String b){
        return Integer.parseInt(a) + Integer.parseInt(b);
    }
}
