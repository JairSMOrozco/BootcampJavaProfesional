package com.sierisimo.clase3;

import java.util.*;
import java.io.*;

public class LoopsHackerRank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Número de series");
        int t = in.nextInt();
        for (int i = 0; i < t; i++){
            System.out.println("Ingresa a");
            int a = in.nextInt();
            System.out.println("Ingresa b");
            int b = in.nextInt();
            System.out.println("Ingresa n");
            int n = in.nextInt();

            double terms = a;

            for(int j = 0; j < n; j++){
                terms = terms + Math.pow(2,j) * b;
                System.out.println(terms + " ");
            }
            System.out.println("");

        }

        in.close();
    }
}
