package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static int perimetroRectangulo(int a, int b) {
        int r = a * b;
        return r;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escribe la base del rectangulo");
        int respuesta = Integer.parseInt(br.readLine());
        System.out.println("Escribe la altura del rectangulo");
        int respuestados = Integer.parseInt(br.readLine());

        int resultado = perimetroRectangulo(respuesta, respuestados);
        System.out.println("El perimetro es " + resultado);
    }

}
