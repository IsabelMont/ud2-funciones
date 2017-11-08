package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean esPar(int n) {
        if (n % 2 == 0)
            return true;
        else
            return false;
    }

    public static boolean esImpar(int n) {
        if (n % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe un número");
        int numero = Integer.parseInt(br.readLine());

        esPar(numero);

        if (esImpar(numero)) {
            System.out.println("Es impar");
        } else {
            System.out.println("Es par");
        }

    }
}
