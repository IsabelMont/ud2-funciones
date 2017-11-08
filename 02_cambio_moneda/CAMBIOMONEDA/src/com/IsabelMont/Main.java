package com.IsabelMont;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static double calcularcambio(double euros, String moneda) {
        double resultadouno = 0;

        if (moneda.equalsIgnoreCase("usd")) {
            resultadouno = euros * 1.16075;
        }
        if (moneda.equalsIgnoreCase("gbp")) {
            resultadouno = euros * 0.88125;
        }
        if (moneda.equalsIgnoreCase("cny")) {
            resultadouno = euros * 7.7021;
        }
        if (moneda.equalsIgnoreCase("jpy")) {
            resultadouno = euros * 132.03;
        }
        return resultadouno;
    }


    public static void main(String[] args) throws IOException {
        String moneda;
        double valor;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("¿Cuantos euros quieres transformar?");
            valor = Double.parseDouble(br.readLine());
            System.out.println("¿A qué moneda lo quieres transformar? ( USD, GBP, CNY, JPY)");
            moneda = br.readLine();
        } while (!moneda.equalsIgnoreCase("usd") && !moneda.equalsIgnoreCase("gbp") &&
                !moneda.equalsIgnoreCase("cny") && !moneda.equalsIgnoreCase("jpy"));

        System.out.println(calcularcambio(valor, moneda));
    }
}
