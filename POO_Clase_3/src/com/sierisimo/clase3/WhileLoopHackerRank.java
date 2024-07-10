package com.sierisimo.clase3;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class WhileLoopHackerRank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("linea 1");
        String a = scanner.nextLine();

        System.out.println("linea 2");
        String b = scanner.nextLine();

        System.out.println("linea 3");
        String c = scanner.nextLine();
        int contador = 0;

        while(scanner.hasNext()){
            contador++;
            String input = scanner.next();
            System.out.println(contador + " " + input);
        }

        scanner.close();
    }
}
