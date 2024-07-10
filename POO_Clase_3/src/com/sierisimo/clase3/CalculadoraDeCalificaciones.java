package com.sierisimo.clase3;

import java.util.Scanner;

public class CalculadoraDeCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("INgresa el porcentaje de puntaje: ");
        int porcentaje = scanner.nextInt();
        char calificacion;

        //Validación
        if(porcentaje < 0 || porcentaje > 100){
            System.out.println("Dato inválido. El porcentaje debe de estar entre 0 y 100");
        }else {
            switch (porcentaje){
                case 90,91,92,93,94,95,96,97,98,99,100 :
                    calificacion = 'A';
                    System.out.println("La calificación es: " + calificacion);
                    break;
                case 80,81,82,83,84,85,86,87,88,89 :
                    calificacion = 'B';
                    System.out.println("La calificación es: " + calificacion);
                    break;
                case 70,71,72,73,74,75,76,77,78,79 :
                    calificacion = 'C';
                    System.out.println("La calificación es: " + calificacion);
                    break;
                case 60,61,62,63,64,65,66,67,68,69 :
                    calificacion = 'D';
                    System.out.println("La calificación es: " + calificacion);
                    break;
                default :
                    calificacion = 'F';
                    System.out.println("La calificación es: " + calificacion);
                    break;
            }
        }

        scanner.close();
    }
}
