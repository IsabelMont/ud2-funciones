package com.IsabelMont;

public class Main {
    public static boolean esValido(String iban){
        //quitar espacios
        iban = iban.replaceAll("\\s+","");

        //Extraer los 4 primero caracteres
        String cuatroprimeros = iban.substring(0,4);
        String restocadena = iban.substring(4);

        //Llevarlos al final
        String nuevoiban = restocadena + cuatroprimeros;

        // Convertir las letras a numeros usando la tabla
        int numero1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(cuatroprimeros.charAt(0))+10;
        int numero2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(cuatroprimeros.charAt(1))+10;

        // Convertirlo en un valor numerico

        nuevoiban = restocadena +numero1+numero2+cuatroprimeros.substring(2);
        // Hacer la división y comprobar
        long numero = Long.parseLong(nuevoiban);

        return numero % 97 == 1;
    }
    public static void main(String[] args) {
        if (esValido(" BE88 3200 3471 3441")){
            System.out.println("Ok");
        }else{
            System.out.println("ERROR");
        }

    }
}
