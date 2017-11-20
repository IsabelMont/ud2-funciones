package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escribe que número de la escala de Fibonacci quieres averiguar");
        int respuesta = Integer.parseInt(br.readLine());

        System.out.println("La respuesta es "+recursiva(respuesta)+" para recursiva y "+repetitiva(respuesta)+" para repetitiva");


    }

    public static int repetitiva(int n) {
        int a = 0;
        int b = 1;
        int i;
        for (i = 0; i < n; i++) {

            int c = b + a;
            a = b;
            b = c;

        }
        return a;

    }

    public static int recursiva(int n) {

        if (n < 2) {
            return n;
        } else
            return recursiva(n - 1) + recursiva(n - 2);


    }
}

