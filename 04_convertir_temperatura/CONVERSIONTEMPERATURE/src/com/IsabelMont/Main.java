package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static double convertirTemperatura(double n) {
        double resultado = n * (1.8) + 32;
        return resultado;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("¿ Cuantos grados quieres transformar a farenheit?");
        double numero = Double.parseDouble(br.readLine());
        System.out.println("Los farenheit son " + convertirTemperatura(numero));
    }

}
