package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static double convertirTemperatura(double n, String escala) {
        if (escala.equalsIgnoreCase("1")) {
            double resultado = n * (1.8) + 32;
            return resultado;
        } else {
            double resultado = n + 273.15;
            return resultado;
        }
    }

    public static void main(String[] args) throws IOException {
        String respuesta;
        double numero;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("¿ Cuantos grados quieres transformar?");
            numero = Double.parseDouble(br.readLine());
            System.out.println("-----TEMPERATURAS-----\n 1. Convertir a Fahrenheit\n2.Convertir a Kelvin\n3.Salir\nOpción:");
            respuesta = br.readLine();
        }
        while (!respuesta.equalsIgnoreCase("1") && !respuesta.equalsIgnoreCase("2")
                && !respuesta.equalsIgnoreCase("3"));
        if (respuesta.equalsIgnoreCase("3"))
            System.out.println("Has decidido terminar con el programa");
        if (respuesta.equalsIgnoreCase("1")) {
            System.out.println(convertirTemperatura(numero, respuesta));
        }
        if (respuesta.equalsIgnoreCase("2")) {
            System.out.println(convertirTemperatura(numero, respuesta));
        }

    }

}